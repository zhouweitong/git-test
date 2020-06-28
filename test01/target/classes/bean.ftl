package com.zhou;

public class ${myClass.className}{
<#list myClass.list as field>
    //${field.fieldRemarks}
    private ${field.fieldType} ${field.fieldName};
</#list>

<#list myClass.list as field>
    public ${field.fieldType} get${field.fieldNameUpperLetter}(){
        return ${field.fieldName};
    }
</#list>
<#list myClass.list as field>
    public void set${field.fieldNameUpperLetter}(${field.fieldType} ${field.fieldName}){
        this.${field.fieldName}=${field.fieldName};
    }
</#list>

}