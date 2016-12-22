/*
 * Copyright 2016 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.kie.dmn.feel.util;

/**
 * Utility class for I18N messages.
 *
 */
public class Msg {
    
    public static final Message0 NULL_OR_UNKNOWN_OPERATOR = new Message0("Null or unknown operator");
    public static final Message0 NEGATING_A_NULL = new Message0("Negating a null");
    public static final Message1 ERROR_ACCESSING_QUALIFIED_NAME = new Message1("Error accessing qualified name: %s");
    public static final Message2 ERROR_EVALUATING_PATH_EXPRESSION = new Message2("Error evaluating path expression: %s. %s");
    public static final Message0 VALUE_NULL_EXPR_NOT_NULL_AND_NOT_UNARY_TEST_EVALUATING_THIS_NODE_AS_FALSE = new Message0("value == null, expr != null and not Unary test, Evaluating this node as FALSE.");
    public static final Message0 EXPRESSION_IS_RANGE_BUT_VALUE_IS_NOT_COMPARABLE = new Message0("Expression is Range but value is not Comparable");
    public static final Message0 CONDITION_WAS_NOT_A_BOOLEAN = new Message0("Condition was not a Boolean");
    public static final Message1 FUNCTION_NOT_FOUND = new Message1("Function not found: '%s'");
    public static final Message1 ERROR_EXECUTING_LIST_FILTER = new Message1("Error executing list filter: %s");
    public static final Message0 INDEX_OUT_OF_BOUND = new Message0("Index out of bound");
    public static final Message2 X_TYPE_INCOMPATIBLE_WITH_Y_TYPE = new Message2("%s type incompatible with %s type");
    public static final Message1 EVALUATED_TO_NULL = new Message1("%s evaluated to null");
    public static final Message1 IS_NULL = new Message1("%s is null");
    public static final Message0 BASE_NODE_EVALUATE_CALLED = new Message0("BaseNode evaluate called");
    public static final Message1 ERROR_RESOLVING_EXTERNAL_FUNCTION_AS_DEFINED_BY = new Message1("Error resolving external function as defined by: %s");
    public static final Message1 UNABLE_TO_FIND_EXTERNAL_FUNCTION_AS_DEFINED_BY = new Message1("Unable to find external function as defined by: %s");
    public static final Message1 PARAMETER_COUNT_MISMATCH_ON_FUNCTION_DEFINITION = new Message1("Parameter count mismatch on function definition: %s");
    public static final Message1 CAN_T_INVOKE_AN_UNARY_TEST_WITH_S_PARAMETERS_UNARY_TESTS_REQUIRE_1_SINGLE_PARAMETER = new Message1("Can't invoke an unary test with %s parameters. Unary tests require 1 single parameter.");
   
    public static String createMessage( Message0 message) {
        return Msg.buildMessage(message);
    }
    public static String createMessage( Message1 message, Object p1) {
        return Msg.buildMessage(message, p1);
    }
    public static String createMessage( Message2 message, Object p1, Object p2) {
        return Msg.buildMessage(message, p1, p2);
    }
    public static String createMessage( Message2 message, Object p1, Object p2, Object p3) {
        return Msg.buildMessage(message, p1, p2, p3);
    }
    public static String createMessage( Message2 message, Object p1, Object p2, Object p3, Object p4) {
        return Msg.buildMessage(message, p1, p2, p3, p4);
    }
    
    private static String buildMessage( Message message, Object... params ) {
        return String.format( message.getMask(), params );
    }
    
    public static interface Message {
        String getMask();
    }
    public abstract static class AbstractMessage implements Message {
        private String mask;
        public AbstractMessage(String mask) {
            this.mask = mask;
        }
        public String getMask() {
            return this.mask;
        }
    }
    public static class Message0 extends AbstractMessage {
        public Message0(String mask) {
            super(mask);
        }
    }
    public static class Message1 extends AbstractMessage {
        public Message1(String mask) {
            super(mask);
        }
    }
    public static class Message2 extends AbstractMessage {
        public Message2(String mask) {
            super(mask);
        }
    }
    public static class Message3 extends AbstractMessage {
        public Message3(String mask) {
            super(mask);
        }
    }
    public static class Message4 extends AbstractMessage {
        public Message4(String mask) {
            super(mask);
        }
    }

    
}