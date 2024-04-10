package modelo;

import java.time.Clock;

public class Alunos {
    Long id;
    String aluno;
    String nota1;
    String nota2;
    String nota3;
    String nota4;
    String media;
    String situacaoFinal;
    private String mediastr;
    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public String getNota1() {
        return nota1;
    }

    public void setNota1(String nota1) {
        this.nota1 = nota1;
    }

    public String getNota2() {
        return nota2;
    }

    public void setNota2(String nota2) {
        this.nota2 = nota2;
    }

    public String getNota3() {
        return nota3;
    }

    public void setNota3(String nota3) {
        this.nota3 = nota3;
    }

    public String getNota4() {
        return nota4;
    }

    public void setNota4(String nota4) {
        this.nota4 = nota4;
    }

    public String getMedia() {
        
        return media;
        
    
        
    }

    public void setMedia(String media) {
        this.media = media;
    }

    public String getSituacaoFinal() {
        
           return situacaoFinal;
    }      
    
   
    public void setSituacao(String situacaoFinal) {
        this.situacaoFinal = situacaoFinal;
    }
}


