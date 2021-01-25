public enum Categoria {
    //tutte le categorie di prodotto

    Elettronica {
        @Override
        public String toString() {
            return "Elettronica";
        }
    },
    Alimentare {
        @Override
        public String toString() {
            return "Alimentare";
        }
    },
    Moda {
        @Override
        public String toString() {
            return "Moda";
        }
    },
    Bricolage {
        @Override
        public String toString() {
            return "Bricolage";
        }
    },
    Sport {
        @Override
        public String toString() {
            return "Sport";
        }
    };

}
