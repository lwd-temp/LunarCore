// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;
import us.hebi.quickbuf.RepeatedInt;

public final class TextJoinQueryCsReqOuterClass {
  /**
   * Protobuf type {@code TextJoinQueryCsReq}
   */
  public static final class TextJoinQueryCsReq extends ProtoMessage<TextJoinQueryCsReq> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>repeated uint32 text_join_id_list = 6;</code>
     */
    private final RepeatedInt textJoinIdList = RepeatedInt.newEmptyInstance();

    private TextJoinQueryCsReq() {
    }

    /**
     * @return a new empty instance of {@code TextJoinQueryCsReq}
     */
    public static TextJoinQueryCsReq newInstance() {
      return new TextJoinQueryCsReq();
    }

    /**
     * <code>repeated uint32 text_join_id_list = 6;</code>
     * @return whether the textJoinIdList field is set
     */
    public boolean hasTextJoinIdList() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>repeated uint32 text_join_id_list = 6;</code>
     * @return this
     */
    public TextJoinQueryCsReq clearTextJoinIdList() {
      bitField0_ &= ~0x00000001;
      textJoinIdList.clear();
      return this;
    }

    /**
     * <code>repeated uint32 text_join_id_list = 6;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableTextJoinIdList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedInt getTextJoinIdList() {
      return textJoinIdList;
    }

    /**
     * <code>repeated uint32 text_join_id_list = 6;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedInt getMutableTextJoinIdList() {
      bitField0_ |= 0x00000001;
      return textJoinIdList;
    }

    /**
     * <code>repeated uint32 text_join_id_list = 6;</code>
     * @param value the textJoinIdList to add
     * @return this
     */
    public TextJoinQueryCsReq addTextJoinIdList(final int value) {
      bitField0_ |= 0x00000001;
      textJoinIdList.add(value);
      return this;
    }

    /**
     * <code>repeated uint32 text_join_id_list = 6;</code>
     * @param values the textJoinIdList to add
     * @return this
     */
    public TextJoinQueryCsReq addAllTextJoinIdList(final int... values) {
      bitField0_ |= 0x00000001;
      textJoinIdList.addAll(values);
      return this;
    }

    @Override
    public TextJoinQueryCsReq copyFrom(final TextJoinQueryCsReq other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        textJoinIdList.copyFrom(other.textJoinIdList);
      }
      return this;
    }

    @Override
    public TextJoinQueryCsReq mergeFrom(final TextJoinQueryCsReq other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasTextJoinIdList()) {
        getMutableTextJoinIdList().addAll(other.textJoinIdList);
      }
      return this;
    }

    @Override
    public TextJoinQueryCsReq clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      textJoinIdList.clear();
      return this;
    }

    @Override
    public TextJoinQueryCsReq clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      textJoinIdList.clear();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof TextJoinQueryCsReq)) {
        return false;
      }
      TextJoinQueryCsReq other = (TextJoinQueryCsReq) o;
      return bitField0_ == other.bitField0_
        && (!hasTextJoinIdList() || textJoinIdList.equals(other.textJoinIdList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        for (int i = 0; i < textJoinIdList.length(); i++) {
          output.writeRawByte((byte) 48);
          output.writeUInt32NoTag(textJoinIdList.array()[i]);
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += (1 * textJoinIdList.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(textJoinIdList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public TextJoinQueryCsReq mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 50: {
            // textJoinIdList [packed=true]
            input.readPackedUInt32(textJoinIdList, tag);
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
          case 48: {
            // textJoinIdList [packed=false]
            tag = input.readRepeatedUInt32(textJoinIdList, tag);
            bitField0_ |= 0x00000001;
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRepeatedUInt32(FieldNames.textJoinIdList, textJoinIdList);
      }
      output.endObject();
    }

    @Override
    public TextJoinQueryCsReq mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1149123376:
          case 449627391: {
            if (input.isAtField(FieldNames.textJoinIdList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedUInt32(textJoinIdList);
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public TextJoinQueryCsReq clone() {
      return new TextJoinQueryCsReq().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static TextJoinQueryCsReq parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new TextJoinQueryCsReq(), data).checkInitialized();
    }

    public static TextJoinQueryCsReq parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new TextJoinQueryCsReq(), input).checkInitialized();
    }

    public static TextJoinQueryCsReq parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new TextJoinQueryCsReq(), input).checkInitialized();
    }

    /**
     * @return factory for creating TextJoinQueryCsReq messages
     */
    public static MessageFactory<TextJoinQueryCsReq> getFactory() {
      return TextJoinQueryCsReqFactory.INSTANCE;
    }

    private enum TextJoinQueryCsReqFactory implements MessageFactory<TextJoinQueryCsReq> {
      INSTANCE;

      @Override
      public TextJoinQueryCsReq create() {
        return TextJoinQueryCsReq.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName textJoinIdList = FieldName.forField("textJoinIdList", "text_join_id_list");
    }
  }
}
