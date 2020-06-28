<html>
<head>
    <title>demo</title>

</head>
<body>
<#list names as name>
<#if name=="zhou">
    ${name} 是爸爸

<#elseif name=="zhou123">
是妈妈\
<#else >
垃圾
</#if>

</#list>
</body>
</html>