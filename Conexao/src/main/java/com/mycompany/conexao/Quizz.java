package com.mycompany.conexao;
import java.sql.*;

public class Quizz {

    private Connection connection;

    public Quizz() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/quizz", "root", "");
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
    }

    public void start() {
        // Consulta as perguntas do banco de dados
        String sql = "SELECT * FROM questions";

        try (Statement statement = connection.createStatement(); ResultSet results = statement.executeQuery(sql)) {
            while (results.next()) {
                // Obtém os dados da pergunta
                String question = results.getString("question");
                String correctAnswer = results.getString("correct_answer");
                String[] possibleAnswers = results.getString("possible_answers").split(",");

                // Mostra a pergunta ao usuário
                System.out.println(question);

                // Obtém a resposta do usuário
                String userAnswer = System.in.nextLine();

                // Verifica se a resposta está correta
                if (userAnswer.equals(correctAnswer)) {
                    // A resposta está correta
                    System.out.println("Resposta correta!");
                } else {
                    // A resposta está incorreta
                    System.out.println("Resposta incorreta!");
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao consultar o banco de dados: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Quizz quizz = new Quizz();
        quizz.start();
    }
}
