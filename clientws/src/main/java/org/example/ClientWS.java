package org.example;

import proxy.BanqueService;
import proxy.BanqueWs;
import proxy.Compte;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService proxy = new BanqueWs().getBanqueServicePort();
        System.out.println(proxy.coversionEuroToDh(11));
        Compte cp = proxy.getCompte(4);
        System.out.println("----------------------------");
        System.out.println(cp.getDateCreation());
        System.out.println(cp.getCode());
        System.out.println(cp.getSolde());
        System.out.println("-----------------------------");
    }
}

