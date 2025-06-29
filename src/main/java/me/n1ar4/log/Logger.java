/*
 * MIT License
 *
 * Project URL: https://github.com/jar-analyzer/jar-obfuscator
 *
 * Copyright (c) 2024-2025 4ra1n (https://github.com/4ra1n)
 *
 * This project is distributed under the MIT license.
 *
 * https://opensource.org/license/mit
 */

package me.n1ar4.log;


public class Logger {
    private String formatMessage(String message, Object[] args) {
        int start = 0;
        StringBuilder sb = new StringBuilder();
        int argIndex = 0;
        while (start < message.length()) {
            int open = message.indexOf("{}", start);
            if (open == -1) {
                sb.append(message.substring(start));
                break;
            }
            sb.append(message, start, open);
            if (argIndex < args.length) {
                sb.append(args[argIndex++]);
            } else {
                sb.append("{}");
            }
            start = open + 2;
        }
        return sb.toString();
    }

    public void info(String message) {
        Log.info(message);
    }

    public void info(String message, Object... args) {
        Log.info(formatMessage(message, args));
    }

    public void error(String message) {
        Log.error(message);
    }

    public void error(String message, Object... args) {
        Log.error(formatMessage(message, args));
    }

    public void debug(String message) {
        Log.debug(message);
    }

    public void debug(String message, Object... args) {
        Log.debug(formatMessage(message, args));
    }

    public void warn(String message) {
        Log.warn(message);
    }

    public void warn(String message, Object... args) {
        Log.warn(formatMessage(message, args));
    }
}
