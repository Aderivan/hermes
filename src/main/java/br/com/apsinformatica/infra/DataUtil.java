/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.apsinformatica.infra;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author Tiago Montezuma
 */
public class DataUtil {

    /**
     * Retorna uma data no formato Ex.: "dd/MM/yyyy HH:mm:ss"
     *
     * @param v
     * @param format
     * @return
     */
    public static String getDataStringFormato(Date v, String format) {
        String retorno = "";
        if (v != null) {
            retorno = new SimpleDateFormat(format).format(v);
        }
        return retorno;
    }

    /**
     * Retorna uma data no formato "dd/MM/yyyy"
     *
     * @param v
     * @return
     */
    public static String getDataString(Date v) {
        String retorno = "";
        if (v != null) {
            retorno = DataUtil.getDataStringFormato(v, "dd/MM/yyyy");
        }
        return retorno;
    }

    /**
     * Retorna uma data no formato "yyyy-MM-dd"
     *
     * @param v
     * @return
     */
    public static String getDataStringFormatoAmericano(Date v) {
        String retorno = "";
        if (v != null) {
            retorno = DataUtil.getDataStringFormato(v, "yyyy-MM-dd");
        }
        return retorno;
    }

    /**
     * Retorna uma data no formato "yyyy-MM-dd HH:mm:ss"
     *
     * @param v
     * @return
     */
    public static String getDataHoraStringFormatoAmericano(Date v) {
        String retorno = "";
        if (v != null) {
            retorno = DataUtil.getDataStringFormato(v, "yyyy-MM-dd HH:mm:ss");
        }
        return retorno;
    }

    /**
     * Retorna uma data no formato "dd/MM/yyyy HH:mm:ss")
     *
     * @param v
     * @return
     */
    public static String getDataHoraString(java.sql.Date date) {
        String retorno = "";
        if (date != null) {
            retorno = DataUtil.getDataStringFormato(date, "dd/MM/yyyy HH:mm:ss");
        }
        return retorno;
    }

    /**
     * Retorna a Data no Formato dd/MM/yyyy HH:mm:ss
     *
     * @return
     */
    public static String getHojePtBrString() {
        return DataUtil.getDataStringFormato(new Date(), "dd/MM/yyyy HH:mm:ss");
    }

    /**
     * Retorna a Data no Formato dd/MM/yyyy HH:mm:ss
     * @return
     */
    public static String getHojeAmericanoString() {
        return DataUtil.getDataStringFormato(new Date(), "yyyy-MM-dd HH:mm:ss");
    }
    
    /**
     * Retorna a Data no Formato Ex.: "dd/MM/yyyy HH:mm:ss"
     *
     * @param formato
     * @return
     */
    public static String getHojeString(String formato) {
        return DataUtil.getDataStringFormato(new Date(), formato);
    }

    /**
     * Retorna a Data e hora hoje
     *
     * @return
     */
    public static Date getHojeDate() {
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date d = null;
        try {
            d = formatador.parse(formatador.format(new Date()));
        } catch (ParseException ex) {
            Logger.getLogger(DataUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return d;
    }

    /**
     * Retorna a Data e hora hoje
     *
     * @return
     */
    public static java.sql.Date getHojeSqlDate() {
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        java.util.Date d = null;

        try {
            d = formatador.parse(new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date()));
        } catch (ParseException ex) {
            Logger.getLogger(DataUtil.class.getName()).log(Level.SEVERE, null, ex);
        }

        java.sql.Date sqlDate = new java.sql.Date(d.getTime());

        return sqlDate;
    }

    /**
     * Parse de data do tipo "dd/MM/yyyy"
     *
     * @param data
     * @return
     * @throws Exception
     */
    public static Date getDataFormatoPtBr(String data) throws Exception {
        if (data == null || data.equals("")) {
            return null;
        }

        Date date = null;
        try {
            DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            date = (java.util.Date) formatter.parse(data);
        } catch (ParseException e) {
            throw e;
        }
        return date;
    }

    /**
     * Converte data americano (yyyy-MM-dd) para PtBr (dd/MM/yyyy)
     *
     * @param data
     * @return
     * @throws Exception
     */
    public static String getConverteDataAmericanoToPtBr(String data) {
        String ano, mes, dia;
        if (data == null || data.equals("")) {
            return null;
        }
        data = data.substring(0, 10);
        data = data.substring(8, 10) + "/" + data.substring(5, 7) + "/" + data.substring(0, 4);
        //data = data.replaceAll("-", "/");
        return data;
    }

    /**
     * Converte data PtBr (dd/MM/yyyy) americano (yyyy-MM-dd)
     *
     * @param data
     * @return
     * @throws Exception
     */
    public static String getConverteDataPtBrToAmericano(String data) {
        String ano, mes, dia;
        if (data == null || data.equals("")) {
            return null;
        }
        //dd/MM/yyyy
        data = data.substring(0, 10);
        data = data.substring(6, 10) + "-" + data.substring(3, 5) + "-" + data.substring(0, 2);
        return data;
    }

    /**
     * Verifica se a data no formato "dd/MM/yyyy" é valida
     *
     * @param data
     * @return
     */
    public static Boolean isDataValida(String data) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);  ///ignora o números de caracteres  ex: 05/05/2015  e ex: 5/05/2015  mesma coisa
        Date d = null;
        boolean b = false;
        try {
            d = sdf.parse(data);
            b = true;
            // se passou pra cá, é porque a data é válida
        } catch (ParseException e) {
            // se cair aqui, a data é inválida
            System.err.println("Validando da Data inválida" + e.getLocalizedMessage());
        }
        return b;
    }

    /**
     * Converte String de Data no formato americano ("yyyy-MM-dd") para
     * java.sql.date
     *
     * @param data
     * @return
     * @throws ParseException
     */
    public static java.sql.Date getConverterStringAmericanoToSqlDate(String data) throws ParseException {
        DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
        java.sql.Date date = new java.sql.Date(fmt.parse(data).getTime());
        return date;
    }

    public static java.sql.Date getConverterXMLGregorianCalendarToSqlDate(XMLGregorianCalendar XMLdate){
        Date date = XMLdate.toGregorianCalendar().getTime();
        java.sql.Date dataSql = new java.sql.Date(date.getTime());
        return dataSql;
    }    
    
    public static XMLGregorianCalendar getConverterSqlDateToXMLGregorianCalendar( Date data) {
            GregorianCalendar c = new GregorianCalendar();
            c.setTime(data);
            XMLGregorianCalendar date2 = null; 
        try {
            date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
        } catch (DatatypeConfigurationException ex) {
            Logger.getLogger(DataUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return date2;    
    }
    /**
     * Converte String de Data no formato americano ("dd/MM/yyyy") para
     * java.sql.date
     *
     * @param data
     * @return
     * @throws ParseException
     */
    public static java.sql.Date getConverterStringPtbrToSqlDate(String data) throws ParseException {
        DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
        java.sql.Date date = new java.sql.Date(fmt.parse(data).getTime());
        return date;
    }

    /**
     * Converte String de Data no formato americano ("yyyy-MM-dd HH:mm:ss") para
     * java.util.date
     *
     * @param data
     * @return
     * @throws ParseException
     */
    public static java.util.Date getConverterStringAmericanoToDateTime(String data) throws ParseException {
        DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        java.util.Date date = new java.util.Date(fmt.parse(data).getTime());

        return date;
    }

    /**
     * Converte String de Data no formato americano ("yyyy-MM-dd") para
     * java.util.date
     *
     * @param data
     * @return
     * @throws ParseException
     */
    public static java.util.Date getConverterStringAmericanoToDate(String data) throws ParseException {
        DateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date date = new java.util.Date(fmt.parse(data).getTime());

        return date;
    }

    /**
     * Converte String de Data e hora no formato PtBr ("dd/MM/yyyy HH:mm:ss")
     * para java.sql.date
     *
     * @param data
     * @return
     * @throws ParseException
     */
    public static java.sql.Date getConverterStringToSqlDateTime(String data) throws ParseException {
        DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        java.sql.Date date = new java.sql.Date(fmt.parse(data).getTime());
        return date;
    }

    /**
     * Calculando a diferência entre datas
     *
     * @param dataInicio
     * @param dataFim
     * @return
     */
    public static long getDiferenciaDataHora(java.util.Date dataInicio, java.util.Date dataFim) {
        // Formatando a data
        SimpleDateFormat sdFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        // Convertendo
        sdFormat.format(dataInicio);
        sdFormat.format(dataFim);

        long tempoInicio = dataInicio.getTime();
        long tempoFim = dataFim.getTime();
        long dif = tempoFim - tempoInicio;

        // calculando a diferência
        return (dif / (1000 * 60 * 60));
    }

    /**
     * Método que irá calcular se a hora inicial é menor que a hora final
     *
     * @param hora1
     * @param hora2
     * @return
     * @throws ParseException
     */
    public static boolean isHoraInicialMaiorQueHoraFinal(String hora1, String hora2) throws ParseException {
        // Calculando as datas
        Date dataInicio = DataUtil.getSomarHora(hora1, null);
        Date dataFim = DataUtil.getSomarHora(hora2, null);

        // Caso a hora inicial seja maior que a hora final
        return (dataInicio.getTime() > dataFim.getTime());
    }

    /**
     * Método que irá passar a hora e irá retornar a data
     *
     * @param hora
     * @param tipoAtualizacao
     * @return
     */
    public static java.util.Date getSomarHora(String hora, Integer tipoAtualizacao) {

        // Explodindo a hora
        String[] arrHora = hora.split(":");
        Integer horaInteiro = Integer.parseInt(arrHora[0]);
        Integer minutoInteiro = Integer.parseInt(arrHora[1]);
        java.util.Date data;

        // Caso não tenha tipo de atualização
        if (tipoAtualizacao == null) {
            // Calculando Data Inicio
            Calendar now = Calendar.getInstance();
            now.add(Calendar.HOUR, +horaInteiro);
            now.add(Calendar.MINUTE, +minutoInteiro);
            data = now.getTime();
        } else {
            // Calculando Data Inicio
            Calendar now = Calendar.getInstance();
            now.add(Calendar.HOUR, +horaInteiro);
            now.add(Calendar.MINUTE, +minutoInteiro);

            if (tipoAtualizacao == 1) {
                now.add(Calendar.MONTH, +1);
            } else {
                now.add(Calendar.WEEK_OF_YEAR, +1);
            }

            data = now.getTime();
        }

        // Retornando a data somando a hora
        return data;
    }

    /**
     * Método que irá passar a hora e irá retornar a data
     *
     * @param dia
     * @param tipoAtualizacao
     * @return
     */
    public static java.util.Date getSomarDia(Integer dia) {
        // Explodindo a hora
        java.util.Date data;
        // Calculando Data Inicio
        Calendar now = Calendar.getInstance();
        now.add(Calendar.DAY_OF_MONTH, dia);
        data = now.getTime();
        // Retornando a data somando a hora
        return data;
    }

    /**
     * Irá retornar o dia, somando caso o integer seja posito ou subtraindo caso
     * o mesmo seja negativo
     *
     * @param qtdDias
     * @return
     */
    public static java.util.Date getSubtrairHojeMenosDia(Integer qtdDias) {
        // Calculando Data Inicio
        Calendar now = Calendar.getInstance();
        now.add(Calendar.DAY_OF_YEAR, qtdDias);
        java.util.Date data = now.getTime();

        // Retornando a data calculada
        return data;
    }

    /**
     * Irá converter java.util.Date pra java.sql.date
     *
     * @param dateUtil
     * @return
     */
    public static java.sql.Date getDateToDateSql(java.util.Date dateUtil) {
        java.sql.Date dataSql = new java.sql.Date(dateUtil.getTime());
        return dataSql;
    }
}
