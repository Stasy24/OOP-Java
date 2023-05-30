package Laba_3;


    class ThreeDimensionalVector extends Vector {
        private double x;
        private double y;
        private double z;

        public ThreeDimensionalVector(String name, double x, double y, double z) {
            super(name);
            this.x = x;
            this.y = y;
            this.z = z;
        }

        @Override
        public double getLength() {
            return Math.sqrt(x * x + y * y + z * z);
        }
    }
