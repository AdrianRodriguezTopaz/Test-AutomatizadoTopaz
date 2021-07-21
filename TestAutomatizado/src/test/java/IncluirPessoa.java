import com.fasterxml.jackson.databind.ser.Serializers;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import IncluirPessoaPOJOPackages.*;

import javax.swing.*;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.*;


public class IncluirPessoa extends BaseTests {

    LocalDateTime dateNow = LocalDateTime.now();
    String fechaNow = dateNow.toString();

    @Test
    public void pruebaConParametros(){
        incluirPessoaPost("32563849519","CPF",  "2000-08-10T00:00:00Z", "NAO", "FEMININO", "RIO DE JANEIRO",
                "76", "MAMAE AMANDA ARAUJO", "PAPAI AMANDA ARAUJO", "RJ", "AMANDA ARAUJO", "SOLTEIRO",
                "BRASILEIRO", "NAO", "NAO", 130000, "NAO", "HIST", "NAO", "HIST@GMAIL.COM",
                "1" , "Algun Cargo", 5000,  "SIM", 4000, "NAO",
                 "51", "998085315", "", "CELULAR", "2010-12-02", "76453782120",
                 "SSP", "RG", "RS", "2025-12-02", "01009999", "CRISTOVÃO COLOMBO",
                "RUA", 2948, "HIGIENOPOLIS", "AP 610", "RESIDENCIAL", "NAO_INFORMADA");
    }

    //verificar dataNascimiento, llega como string pero debe ser Date
    public void incluirPessoaPost(String numeroDocumento, String tipoDocumento, String dataNascimento, String emancipado, String genero,
                                  String naturalidade, String codigoPais, String nomeMae, String nomePai, String ufNaturalidade,
                                  String nomeCompleto, String estadoCivil, String nacionalidade, String declaracaoFatca, String declaracaoPpe,
                                  int patrimonioFim, String pessoaComDeficiencia, String apelido, String funcionario, String email,
                                  String codigoProfissao, String nomeCargo,int rendaBruta, String rendaComprovada, int rendaLiquida,
                                  String rendaPresumida,String ddd,String telefone, String ramal , String tipoTelefone, String dataExpedicao,
                                  String adicionalnumeroDocumento, String orgaoExpedicaoSigla, String adicionaltipoDocumento, String ufExpedicao,
                                  String dataExpiracao,String cep, String logradouro, String tipoLogradouro,int numero, String bairro, String complemento,
                                  String tipoEndereco, String tipoResidencia)
     {
        //dados basicos
         DadosBasicos dadosBasicos = new DadosBasicos();
         dadosBasicos.setDataNascimento(dataNascimento);
         dadosBasicos.setEmancipado(emancipado);
         dadosBasicos.setGenero(genero);
         dadosBasicos.setNaturalidade(naturalidade);
         dadosBasicos.setCodigoPais(codigoPais);
         dadosBasicos.setNomeMae(nomeMae);
         dadosBasicos.setNomePai(nomePai);
         dadosBasicos.setUfNaturalidade(ufNaturalidade);
         dadosBasicos.setNaturalidade(naturalidade);
         dadosBasicos.setNomeCompleto(nomeCompleto);
         dadosBasicos.setEstadoCivil(estadoCivil);
         dadosBasicos.setNacionalidade(nacionalidade);
         dadosBasicos.setDeclaracaoFatca(declaracaoFatca);
         dadosBasicos.setDeclaracaoPpe(declaracaoPpe);
         dadosBasicos.setPatrimonioFim(patrimonioFim);
         dadosBasicos.setPessoaComDeficiencia(pessoaComDeficiencia);
         dadosBasicos.setApelido(apelido);
         dadosBasicos.setFuncionario(funcionario);

         //dadosEmail
         DadosEmail dadosEmail = new DadosEmail();
         dadosEmail.setEmail(email);

         //dadosProfissao
         DadosProfissao dadosProfissao = new DadosProfissao();
         dadosProfissao.setCodigoProfissao(codigoProfissao);
         dadosProfissao.setNomeCargo(nomeCargo);

         //dadosRenda
         DadosRenda dadosRenda = new DadosRenda();
         dadosRenda.setRendaBruta(rendaBruta);
         dadosRenda.setRendaComprovada(rendaComprovada);
         dadosRenda.setRendaLiquida(rendaLiquida);
         dadosRenda.setRendaPresumida(rendaPresumida);

         //dadosTelefono
         DadosTelefone dadosTelefone = new DadosTelefone();
         dadosTelefone.setDdd(ddd);
         dadosTelefone.setTelefone(telefone);
         dadosTelefone.setRamal(ramal);
         dadosTelefone.setTipoTelefone(tipoTelefone);

         //documentoAdicional
         DocumentoAdicional documentoAdicional = new DocumentoAdicional();
         documentoAdicional.setDataExpedicao(dataExpedicao);
         documentoAdicional.setNumeroDocumento(adicionalnumeroDocumento);
         documentoAdicional.setOrgaoExpedicaoSigla(orgaoExpedicaoSigla);
         documentoAdicional.setTipoDocumento(adicionaltipoDocumento);
         documentoAdicional.setUfExpedicao(ufExpedicao);
         documentoAdicional.setDataExpiracao(dataExpiracao);

         //dadosEndereco

         DadosEndereco dadosEndereco = new DadosEndereco();
         dadosEndereco.setCep(cep);
         dadosEndereco.setLogradouro(logradouro);
         dadosEndereco.setTipoLogradouro(tipoLogradouro);
         dadosEndereco.setNumero(numero);
         dadosEndereco.setBairro(bairro);
         dadosEndereco.setComplemento(complemento);
         dadosEndereco.setTipoEndereco(tipoEndereco);
         dadosEndereco.setTipoResidencia(tipoResidencia);


         IncluirPessoaObject incluirPessoaPOJO = new IncluirPessoaObject();
         incluirPessoaPOJO.setNumeroDocumento(numeroDocumento);
         incluirPessoaPOJO.setTipoDocumento(tipoDocumento);
         incluirPessoaPOJO.setDadosBasicos(dadosBasicos);
         incluirPessoaPOJO.setDadosEmail(dadosEmail);
         incluirPessoaPOJO.setDadosProfissao(dadosProfissao);
         incluirPessoaPOJO.setDadosRenda(dadosRenda);
         incluirPessoaPOJO.setDadosTelefone(dadosTelefone);
         incluirPessoaPOJO.setDocumentoAdicional(documentoAdicional);
         incluirPessoaPOJO.setDadosEndereco(dadosEndereco);

         String response =  RestAssured.given()
                .header("Topaz-Channel", "MOBILE")
                .header("Topaz-Transaction-ID", fechaNow)
                .header("Topaz-User", "TOP")
                .header("Topaz-Company", 358)
                .header("Topaz-Branch", 1001)
                .header("Content-Type", "application/json;charset=UTF-8")
                .header("Authorization", "Bearer 45684184")
                .header("Topaz-Ip-Address", "127.0.0.0")
                .header("Topaz-Mac-Address", "00-14-22-01-23-45")

                 .contentType(ContentType.JSON)
                 .body(incluirPessoaPOJO)
                 .post( "PessoaService/v1/incluirPessoa")
                 .then()
                 .log().body()
                 .extract().asString();
         incuirCliente(incluirPessoaPOJO,"FISICA","NAO_LIGADA","TITULAR");

        }

        public void incuirCliente(IncluirPessoaObject incluirPessoaPOJO, String tipoCliente, String pessoaLigada, String titular)
        {
            DadosCliente dadosCliente = new DadosCliente();
            dadosCliente.setTipoCliente(tipoCliente);
            dadosCliente.setPessoaLigada(pessoaLigada);
            dadosCliente.setTitular(titular);
            incluirPessoaPOJO.setDadosCliente(dadosCliente);

            LocalDateTime dateNow = LocalDateTime.now();
            String fechaAhora = dateNow.toString();
            ResponseIncluirCliente responseIncluirCliente =  RestAssured.given()
                    .header("Topaz-Channel", "MOBILE")
                    .header("Topaz-Transaction-ID", fechaAhora)
                    .header("Topaz-User", "TOP")
                    .header("Topaz-Company", 358)
                    .header("Topaz-Branch", 1001)
                    .header("Content-Type", "application/json;charset=UTF-8")
                    .header("Authorization", "Bearer 45684184")
                    .header("Topaz-Ip-Address", "127.0.0.0")
                    .header("Topaz-Mac-Address", "00-14-22-01-23-45")

                    .contentType(ContentType.JSON)
                    .body(incluirPessoaPOJO)
                    .post( "Cliente/v1/incluirCliente")
                    .then()
                    .extract()
                    .body().as(ResponseIncluirCliente.class);

            System.out.println("tipoDocumento: " + responseIncluirCliente.getTipoDocumento()+ ", codigoCliente: " + responseIncluirCliente.getCodigoCliente()
                    +", numeroDocumento: " +responseIncluirCliente.getNumeroDocumento() + ", titular: " + responseIncluirCliente.getTitular() +
                    ", pessoLigada: " + responseIncluirCliente.getPessoaLigada());


            incluirContaCorrente("1",responseIncluirCliente.getCodigoCliente(),"3","CONTA_CORRENTE_PF", 4);

        }

        public void incluirContaCorrente(String agencia, String codigoCliente, String cestaId, String produto, int diaCobrancaCesta)
        {
            IncluirContaCorrente incluirContaCorrente = new IncluirContaCorrente();
            incluirContaCorrente.setAgencia(agencia);
            incluirContaCorrente.setCodigoCliente(codigoCliente);
            incluirContaCorrente.setCestaId(cestaId);
            incluirContaCorrente.setProduto(produto);
            incluirContaCorrente.setDiaCobrancaCesta(diaCobrancaCesta);

            LocalDateTime dateNow = LocalDateTime.now();
            String fechaAhora = dateNow.toString();
            ResponseConta responseConta =  RestAssured.given()
                    .header("Topaz-Channel", "MOBILE")
                    .header("Topaz-Transaction-ID", fechaAhora)
                    .header("Topaz-User", "TOP")
                    .header("Topaz-Company", 358)
                    .header("Topaz-Branch", 1001)
                    .header("Content-Type", "application/json;charset=UTF-8")
                    .header("Authorization", "Bearer 45684184")
                    .header("Topaz-Ip-Address", "127.0.0.0")
                    .header("Topaz-Mac-Address", "00-14-22-01-23-45")

                    .contentType(ContentType.JSON)
                    .body(incluirContaCorrente)
                    .post( "ContaCorrenteService/v1/incluirContaCorrente")
                    .then()
                    .extract()
                     .body().as(ResponseConta.class);

            System.out.println("numeroConta: " + responseConta.getNumeroConta() + ", tipoConta: " + responseConta.getTipoConta()
            + ", agencia: " + responseConta.getAgencia());

            depositoEnConta(responseConta.getNumeroConta(), "CLARO", responseConta.getTipoConta(), "11000");
        }

        public void depositoEnConta(String conta, String descricao, String tipoConta,String valor){

        Cashin cashin = new Cashin();
        cashin.setConta(conta);
        cashin.setDescricao(descricao);
        cashin.setTipoConta(tipoConta);
        cashin.setValor(valor);

            LocalDateTime dateNow = LocalDateTime.now();
            String fechaAhora = dateNow.toString();
            String response =  RestAssured.given()
                    .header("Topaz-Channel", "MOBILE")
                    .header("Topaz-Transaction-ID", fechaAhora)
                    .header("Topaz-User", "TOP")
                    .header("Topaz-Company", 358)
                    .header("Topaz-Branch", 1001)
                    .header("Content-Type", "application/json;charset=UTF-8")
                    .header("Authorization", "Bearer 45684184")
                    .header("Topaz-Ip-Address", "127.0.0.0")
                    .header("Topaz-Mac-Address", "00-14-22-01-23-45")

                    .contentType(ContentType.JSON)
                    .body(cashin)
                    .post( "ContaCorrenteService/v1/cashin")
                    .then()
                    .log().body()
                    .extract().asString();

        }

/*
    @Test
    //Paso 1 - Se obtienen los 9 numeros, se reciben por parametro
        public void generarCPF() {

        //utilizo random para generar 9 numeros al azar de 1 a 9, se generan de tipo double, por eso los paso a int
        double num1Double = Math.random() * 8 + 1;
        int num1 = (int) Math.round(num1Double);
        double num2Double = Math.random() * 8 + 1;
        int num2 = (int) Math.round(num2Double);
        double num3Double = Math.random() * 8 + 1;
        int num3 = (int) Math.round(num3Double);
        double num4Double = Math.random() * 8 + 1;
        int num4 = (int) Math.round(num4Double);
        double num5Double = Math.random() * 8 + 1;
        int num5 = (int) Math.round(num5Double);
        double num6Double = Math.random() * 8 + 1;
        int num6 = (int) Math.round(num6Double);
        double num7Double = Math.random() * 8 + 1;
        int num7 = (int) Math.round(num7Double);
        double num8Double = Math.random() * 8 + 1;
        int num8 = (int) Math.round(num8Double);
        double num9Double = Math.random() * 8 + 1;
        int num9 = (int) Math.round(num9Double);


        //Paso 2 - Se multiplica cada dígito por un número, comenzando por 10 y decrementando para cada dígito.
        int multipl1Paso2 = num1 * 10;
        int multipl2Paso2 = num2 * 9;
        int multipl3Paso2 = num3 * 8;
        int multipl4Paso2 = num4 * 7;
        int multipl5Paso2 = num5 * 6;
        int multipl6Paso2 = num6 * 5;
        int multipl7Paso2 = num7 * 4;
        int multipl8Paso2 = num8 * 3;
        int multipl9Paso2 = num9 * 2;

        //Paso 3 - Se suma el resultado de la multiplicación:

        int sumaDeMultiplicacion = multipl1Paso2 + multipl2Paso2 + multipl3Paso2 + multipl4Paso2 + multipl5Paso2 +
                multipl6Paso2 + multipl7Paso2 + multipl8Paso2 + multipl9Paso2;

        // Paso 4 -Primer digito verificador
        // Se multiplica el resultado por 10 y luego se divide por 11.
        // El resto de esa división es el primer dígito verificador.

        int multiplicaXDiez = sumaDeMultiplicacion * 10;
        double primerDigitoVerificadorDouble = multiplicaXDiez % 11;

        if (primerDigitoVerificadorDouble > 9) { //si el resto es mayor a 9, corresponde que el digito verificador sea 0
            primerDigitoVerificadorDouble = 0;
        }
        int primerDigitoVerificador = (int) Math.round(primerDigitoVerificadorDouble);

        //Paso 5 - Segundo dígito verificador
        // A partir de los primeros 9 dígitos mas el primer dígito verificador calculado,
        // se multiplica cada dígito por la secuencia decreciente de 11 a 2.

        int sumaPaso5 = num1 * 11 + num2 * 10 + num3 * 9 + num4 * 8 + num5 * 7 + num6 * 6 + num7 * 5 + num8 * 4 + num9 * 3 + primerDigitoVerificador * 2;
        int multuplicacionPaso5 = sumaPaso5 * 10;
        int segundoDigitoVerificador = multuplicacionPaso5 % 11;

        if (segundoDigitoVerificador > 9) { //si el resto es mayor a 9, corresponde que el digito verificador sea 0
            segundoDigitoVerificador = 0;
        }
        //CPF generado;
        //lo paso a string para posteriormente poder concatenar todos los numeros
        String numeroIngresado1 = String.valueOf(num1);
        String numeroIngresado2 = String.valueOf(num2);
        String numeroIngresado3 = String.valueOf(num3);
        String numeroIngresado4 = String.valueOf(num4);
        String numeroIngresado5 = String.valueOf(num5);
        String numeroIngresado6 = String.valueOf(num6);
        String numeroIngresado7 = String.valueOf(num7);
        String numeroIngresado8 = String.valueOf(num8);
        String numeroIngresado9 = String.valueOf(num9);
        String primerDigVerif = String.valueOf(primerDigitoVerificador);
        String segundoDigVerif = String.valueOf(segundoDigitoVerificador);
    //concateno los numeros
        String cpfString = numeroIngresado1 + numeroIngresado2 + numeroIngresado3 + numeroIngresado4 + numeroIngresado5 + numeroIngresado6 + numeroIngresado7
                + numeroIngresado8 + numeroIngresado9 + primerDigVerif + segundoDigVerif;
        //imprimo los numeros que ingreso el sistema al azar
        System.out.println("Numero 1: " + num1);
        System.out.println("Numero 2:" + num2);
        System.out.println("Numero 3: " + num3);
        System.out.println("Numero 4: " + num4);
        System.out.println("Numero 5: " + num5);
        System.out.println("Numero 6: " + num6);
        System.out.println("Numero 7: " + num7);
        System.out.println("Numero 8: " + num8);
        System.out.println("Numero 9: " + num9);
        System.out.println("Primer digito verificador:" + primerDigitoVerificador);
        System.out.println("Segundo digito verificador: " + segundoDigitoVerificador);
        System.out.println(cpfString);

    }
*/
    /*public void validacionesBD(){
        String selectTableSQL = " SELECT * from MOVIMIENTOS_CONTABLES";

        Statement statement = null;

        try {

            Connection connection= getOracleConnection();

            statement = connection.createStatement();


            // get data from DB
            ResultSet rs = statement.executeQuery(selectTableSQL);

            while (rs.next())
            {
                String field = rs.getString(1);


                System.out.println("field : " + field);
                System.out.println(rs);
            }

        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }*/

}
