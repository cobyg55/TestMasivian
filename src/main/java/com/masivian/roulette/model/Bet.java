package com.masivian.roulette.model;

import com.masivian.roulette.validator.ValidateText;
import lombok.Data;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@RedisHash("Bet")
@Data
public class Bet {

    @Indexed
    private Long id;
    @NotNull
    @Min(value = 0, message = "min value = 0")
    @Max(value = 10000, message = "max value = 10000")
    private double value;
    @NotNull
    @ValidateText(acceptedValues = {"numero", "color"}, message = "value is invalid, available values included { numero, color }")
    private String betType;
    @NotNull
    @ValidateText(acceptedValues = {"negro", "rojo"}, message = "value is invalid, available values included { negro, rojo }")
    private String color;
    @Min(value = 0, message = "min value = 0")
    @Max(value = 36, message = "max value = 36")
    private int number;
}

