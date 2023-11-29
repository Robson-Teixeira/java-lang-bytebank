# Como?

## Criar Javadoc

- Documentar classes, métodos e afins com:
```
	/**
	 * Documentação...
	 *
	 * @tags
	 */
```
- Project > Generate Javadoc...

## Criar/Utilizar .JAR (pacote de classes)

- **Exportação:** File (ou botão direito no projeto) > Export > Java > JAR file
- **Importação:** Inserir _**.jar**_ no projeto (libs) > Botão direito no _**.jar**_ > Build Path > Add to Build Path

## Criar/Utilizar .JAR (executável)

- **Exportação:** File (ou botão direito no projeto) > Export > Java > JAR file > Next... > JAR Manifest Specification > Main class > Browse
- **Execução:** Abrir terminal e navegar até a pasta onde encontra-se o arquivo _**.jar**_. Na sequência executar o comando:
```
java -jar arquivo.jar
```
