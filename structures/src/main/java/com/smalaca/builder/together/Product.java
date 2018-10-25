package com.smalaca.builder.together;

public class Product {
    private final PartA partA;
    private final PartB partB;
    private PartC partC;
    private PartD partD;

    private Product(PartA partA, PartB partB) {
        this.partA = partA;
        this.partB = partB;
    }

    public static class ProductBuilder {
        private final Product product;

        public ProductBuilder(PartA partA, PartB partB) {
            this.product = new Product(partA, partB);
        }

        public void withPartC() {
            product.partC = new PartC();
        }

        public void with(PartD partD) {
            product.partD = partD;
        }

        public Product build() {
            return product;
        }
    }
}
