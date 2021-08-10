package dev.ivanqueiroz.springbatchdicas.batch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

public class PessoaItemProcessor implements ItemProcessor<Pessoa, Pessoa> {

  private static final Logger log = LoggerFactory.getLogger(PessoaItemProcessor.class);

  @Override
  public Pessoa process(Pessoa pessoa) throws Exception {
    final String primeiroNome = pessoa.getPrimeiroNome().toUpperCase();
    final String segundoNome = pessoa.getUltimoNome().toUpperCase();

    final Pessoa pessoaProcessada = new Pessoa(primeiroNome, segundoNome);
    log.info("Convertendo ({}) em ({})", pessoa, pessoaProcessada);

    return pessoaProcessada;
  }
}
