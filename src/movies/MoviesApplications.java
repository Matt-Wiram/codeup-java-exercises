package movies;

import util.Input;

import java.util.Scanner;

public class MoviesApplications {
    public static void showMovies() {
        Input movie = new Input(new Scanner(System.in));
        for (int i = 0; i < MoviesArray.findAll().length; i++) {
                System.out.println(MoviesArray.findAll()[i].getName());

            }

        boolean cont = movie.yesNo();
        if (cont == true) {
            showMovies();
        } mainShow();
        }

        public static void showCategories() {
        Input movie = new Input(new Scanner(System.in));
            System.out.println("Choose your movies category: ");
            String category = movie.getString();
            for (int i = 0; i < MoviesArray.findAll().length; i++) {
                if (category.equalsIgnoreCase(MoviesArray.findAll()[i].getCategory())) {
                    System.out.println(MoviesArray.findAll()[i].getName());


                }

            }
            boolean cont = movie.yesNo();
            if (cont == true) {
                showCategories();
            } mainShow();
        }

        public static void mainShow() {
            Input getMovie = new Input(new Scanner(System.in));
            System.out.println("Choose to view all movies or by categories. [1. Movies, 2. Categories, 3. Exit] ");
            int check = getMovie.getInt();
            if (check == 1) {
                showMovies();
            } else if (check == 2) {
                showCategories();
            }


        }

    public static void main(String[] args) {
    mainShow();


    }
}
