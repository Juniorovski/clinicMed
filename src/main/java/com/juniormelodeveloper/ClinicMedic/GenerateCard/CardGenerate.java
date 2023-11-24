package com.juniormelodeveloper.ClinicMedic.GenerateCard;

import java.util.Random;

public class CardGenerate {
    public static String gerarNumeroCartao() {
        StringBuilder numeroCartao = new StringBuilder();

        Random random = new Random();

        // Adiciona os 15 dígitos aleatórios
        for (int i = 0; i < 15; i++) {
            numeroCartao.append(random.nextInt(10));
        }

        return numeroCartao.toString();
    }
}
