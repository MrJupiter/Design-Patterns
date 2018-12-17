final class Tramway {
    private EtatTramway _etatTramway = new Deplacement();

    void appuiBoutonArretUrgence() {
        _etatTramway.appuiBoutonArretUrgence();
    }

    void appuiBoutonOuverturePorte() {
        _etatTramway.appuiBoutonOuverturePorte();
    }

    void appuiBoutonProchainArret() {
        _etatTramway.appuiBoutonProchainArret();
    }

    abstract class EtatTramway {
        abstract void appuiBoutonArretUrgence();

        abstract void appuiBoutonOuverturePorte();

        abstract void appuiBoutonProchainArret();
    }

    final class Deplacement extends EtatTramway {

        @Override
        void appuiBoutonArretUrgence() {
            System.out.println("Stoppe le tramway en urgence.");
            _etatTramway = new ArretUrgence();
        }

        @Override
        void appuiBoutonOuverturePorte() {
            // désactivé}
        }

        @Override
        void appuiBoutonProchainArret() {
            System.out.println("Demande d'arrêt.");
            _etatTramway = new ArretImminent();
        }
    }

    final class ArretImminent extends EtatTramway {

        @Override
        void appuiBoutonArretUrgence() {
            System.out.println("Stoppe le tramway en urgence.");
            _etatTramway = new ArretUrgence();
        }

        @Override
        void appuiBoutonOuverturePorte() {
            // désactivé
        }

        @Override
        void appuiBoutonProchainArret() {
            // désactivé
        }
    }

    final class ArretStation extends EtatTramway {

        @Override
        void appuiBoutonArretUrgence() {
            System.out.println("Stoppe le tramway en urgence.");
            _etatTramway = new ArretStation();
        }

        @Override
        void appuiBoutonOuverturePorte() {
            System.out.println("Ouverture des portes");
        }

        @Override
        void appuiBoutonProchainArret() {
            // désactivé
        }
    }

    final class ArretUrgence extends EtatTramway {

        @Override
        void appuiBoutonArretUrgence() {
            System.out.println("Relance le tramway");
            _etatTramway = new ArretStation();
        }

        @Override
        void appuiBoutonOuverturePorte() {
            System.out.println("Ouverture des portes");
        }

        @Override
        void appuiBoutonProchainArret() {
            // Désactivé
        }
    }
}