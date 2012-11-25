package se.ranzdo.bukkit.methodcommand.handlers;

import org.bukkit.command.CommandSender;

import se.ranzdo.bukkit.methodcommand.CommandArgument;
import se.ranzdo.bukkit.methodcommand.TransformError;

public class IntegerArgumentHandler extends NumberArgumentHandler<Integer> {
	@Override
	public Integer transform(CommandSender sender, CommandArgument argument, String value) throws TransformError {
		try {
			return Integer.parseInt(value);
		}
		catch(NumberFormatException e) {
			throw new TransformError(getMessage("parse_error"));
		}
	}
}
