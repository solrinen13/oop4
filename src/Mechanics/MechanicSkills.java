package Mechanics;

public enum MechanicSkills {

    REPAIR_CARS("Ремонт легкового авто"),
    REPAIR_TRUCK("Ремонт грузового авто"),
    REPAIR_BUS("Ремонт автобусов"),
    REPAIR_UNIVERSAL("Ремонт всех типов транспорта");

        private final String Skills;


        MechanicSkills(String skills) {
            Skills = skills;
        }

        public String getSkills() {
            return Skills;
        }

        @Override
        public String toString() {
            return "AbilityToWorkCars{" +
                    "Ability='" + Skills + '\'' +
                    '}';
        }
    }

