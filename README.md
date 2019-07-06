Este é um exemplo de RESTful em Java

Neste exemplo foram implementados somente métodos de servidor.

Observe atentamente o arquivo pom.xml. Há uma biblioteca externa (javainterfaces) que é utilizada com o propósito de padronizar a comunicação entre aplicativos java. Tal importação é desnecessária em outras linguagens e caso opte por criar um cliente na linguagem Java você pode ou não utilizá-la.

Observe também o arquivo Procfile. Nele há uma instrução necessária para executar este aplicativo no Heroku
