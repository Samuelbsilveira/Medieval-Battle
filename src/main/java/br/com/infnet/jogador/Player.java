package br.com.infnet.jogador;

import lombok.*;

import java.time.LocalDate;
@Data@AllArgsConstructor@NoArgsConstructor@Builder
public class Player {

    private String nickmane;
    private String cpf;
    private String nome;
    private int idade;
    private LocalDate dataNascimento;
    }

