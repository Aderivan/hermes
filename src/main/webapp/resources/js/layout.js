function keyPress(e) {
    if(e.keyCode == 27){
        closeAllDialog();
    }
}

function closeAllDialog(){
    for(var propertyName in Primefaces.widgets){
        if (PrimeFaces.widgets[propertyName] instanceof PrimeFaces.widget.Dialog ||
         PrimeFaces.widgets[propertyName] instanceof PrimeFaces.widget.LightBox) {
         PrimeFaces.widgets[propertyName].hide();
     }
        
    }
}