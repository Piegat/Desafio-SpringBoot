package com.desafio.Entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.DataOutput;
import java.util.ArrayList;
import java.util.List;

@Data
public class Valores {

    @Getter @Setter

    private List<Double> valores = new ArrayList<>();


}
