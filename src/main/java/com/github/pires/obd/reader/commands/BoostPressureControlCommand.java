package com.github.pires.obd.reader.commands;

import com.github.pires.obd.commands.pressure.FuelPressureCommand;
import com.github.pires.obd.commands.pressure.PressureCommand;
import com.github.pires.obd.enums.AvailableCommandNames;

public class BoostPressureControlCommand extends PressureCommand {

    /**
     * <p>Constructor for FuelPressureCommand.</p>
     */
    public BoostPressureControlCommand() {
        super("01 70");
    }

    /**
     * <p>Constructor for FuelPressureCommand.</p>
     *
     * @param other a {@link com.github.pires.obd.commands.pressure.FuelPressureCommand} object.
     */
    public BoostPressureControlCommand(BoostPressureControlCommand other) {
        super(other);
    }

//    /**
//     * {@inheritDoc}
//     * <p>
//     * TODO describe of why we multiply by 3
//     */
//    @Override
//    protected final int preparePressureValue() {
//        return buffer.get(2) * 3;
//    }

    /** {@inheritDoc} */
    @Override
    public String getName() {
        return "Boost pressure control";
    }

}