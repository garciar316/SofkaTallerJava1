package exercises;

import entity.Serie;
import entity.VideoGame;

import java.util.ArrayList;
import java.util.List;

public class Exercise18 {

    public static void main(String[] args) {
        List<Serie> series = new ArrayList<>();
        List<VideoGame> videoGames = new ArrayList<>();
        Integer countSeries = 0;
        Integer countVideoGames = 0;

        series.add(new Serie("Naruto", 3, "Anime", "Masashi Kishimoto"));
        series.add(new Serie("Stranger things", 4, "Mystery", "Netflix"));
        series.add(new Serie("BoJack Horseman", 6, "Comedy", "Raphael Bob-Waksberg"));
        series.add(new Serie("The midnight Gospel", 1, "Surrealism", "Pendleton Ward y Duncan Trussell "));
        series.add(new Serie("Lucifer", 6, "Mystery", "Tom Kapinos"));

        videoGames.add(new VideoGame("Devil May Cry 4", 30.0, "Fantasy", "Capcom"));
        videoGames.add(new VideoGame("Elden Ring", 60.0, "Adventure", "From Software"));
        videoGames.add(new VideoGame("Far Cry 4", 35.0, "Action", "Ubisoft Montreal"));
        videoGames.add(new VideoGame("GTA V", 30.0, "Action", "Rockstar North"));
        videoGames.add(new VideoGame("Dark Souls", 45.0, "Fantasy", "From Software"));

        // Entregar las series de posición par y los videojuegos de posición impar
        for (int i = 0; i < 5; i++) {
            if (i % 2 != 0) {
                series.get(i).deliver();
                continue;
            }
            videoGames.get(i).deliver();
        }

        for (Serie serie : series) {
            if (Boolean.TRUE.equals(serie.isDelivered())) {
                countSeries++;
                serie.sendBack();
            }
        }
//        No uso esta forma porque hay que contarlos y el foreach de Arraylist no permite modificar variables locales
//        videoGames.forEach(videoGame -> {
//            if (videoGame.isDelivered()) {
//                videoGame.sendBack();
//            }
//        });

        for (VideoGame videoGame : videoGames) {
            if (Boolean.TRUE.equals(videoGame.isDelivered())) {
                countVideoGames++;
                videoGame.sendBack();
            }
        }


        Serie moreSeasons = series.get(0);
        VideoGame moreHours = videoGames.get(0);

        for (int i = 0; i<5; i++) {
            if (!moreSeasons.compareTo(series.get(i)).equals(moreSeasons)) {
                moreSeasons = series.get(i);
            }
            if (!moreHours.compareTo(videoGames.get(i)).equals(moreHours)) {
                moreHours = videoGames.get(i);
            }
        }

        System.out.printf("Habían %s series entregadas que se han devuelto%n", countSeries);
        System.out.printf("Habían %s video juegos entregados que se han devuelto%n", countVideoGames);
        System.out.printf("La serie con mayor cantidad de temporadas es: %s%n", moreSeasons.toString());
        System.out.printf("El juego con mayor cantidad de horas estimadas es: %s%n", moreHours.toString());
    }
}
