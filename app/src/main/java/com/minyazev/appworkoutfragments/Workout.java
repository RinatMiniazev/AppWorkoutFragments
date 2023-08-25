package com.minyazev.appworkoutfragments;

public class Workout {

    private String name;
    private String description;
    private int imageResourceId;
    public static final Workout[] workouts = {
            new Workout("Ноги вверх", "Лягте на спину, ноги и руки слегка приподнимите, это будет вашим исходным положением. Следующим движением будет подъем ног и торса вверх, при этом постарайтесь коснуться руками своих ног.\nСделайте 10 повторений.", R.drawable.legs_up),
            new Workout("Вращение", "Станьте в упор стоя, крутите обруч сколько сможете, как только сможете.\nСделайте 10 повторений.", R.drawable.so_so),
            new Workout("Приседания", "Станьте прямо, ноги на ширине плеч, руки за головой (А), присядьте(В), а затем выпрыгните вверх, (С). Руки должны все время находиться за головой.\nВыполните 10 повторений.", R.drawable.go_down),
            new Workout("Гантели", "Руки с гантелями держите перед собой.Поверните ваш торс вправо а затем влево, и вернитесь в исходное положение.\nСделайте 15 повторений.", R.drawable.hard_hand),
            new Workout("Руки вверх", "Поставьте перед собой цель и поднимайте руки, чтобы ее достичть, пока не достигнете", R.drawable.hand_up),
            new Workout("С мячом", "Лягте на живот, локтями упритесь в пол, а мяч зажмите между ног, согнув их при этом в коленях (А), это ваше исходное положение. Теперь поднимаем ноги вместе с мячом как можно выше (В).\nВыполните 10 повторений.", R.drawable.ball),
            new Workout("Медитация", "Станьте в упор лежа, при этом ноги закиньте так, чтобы ваши голени располагались на полу. Подкручивайте себя как можете. Поднимайтесь так высоко, как только у вас получится, а затем медленно вернитесь в исходное положение (А).\nСделайте столько повторов, сколько сможете.", R.drawable.meditation)
    };
    // В объекте Workout хранится имя и описание
    private Workout(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
