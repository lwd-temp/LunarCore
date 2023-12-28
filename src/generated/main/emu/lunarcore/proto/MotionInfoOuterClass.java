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

public final class MotionInfoOuterClass {
  /**
   * Protobuf type {@code MotionInfo}
   */
  public static final class MotionInfo extends ProtoMessage<MotionInfo> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional .Vector rot = 9;</code>
     */
    private final VectorOuterClass.Vector rot = VectorOuterClass.Vector.newInstance();

    /**
     * <code>optional .Vector pos = 12;</code>
     */
    private final VectorOuterClass.Vector pos = VectorOuterClass.Vector.newInstance();

    private MotionInfo() {
    }

    /**
     * @return a new empty instance of {@code MotionInfo}
     */
    public static MotionInfo newInstance() {
      return new MotionInfo();
    }

    /**
     * <code>optional .Vector rot = 9;</code>
     * @return whether the rot field is set
     */
    public boolean hasRot() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional .Vector rot = 9;</code>
     * @return this
     */
    public MotionInfo clearRot() {
      bitField0_ &= ~0x00000001;
      rot.clear();
      return this;
    }

    /**
     * <code>optional .Vector rot = 9;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableRot()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public VectorOuterClass.Vector getRot() {
      return rot;
    }

    /**
     * <code>optional .Vector rot = 9;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public VectorOuterClass.Vector getMutableRot() {
      bitField0_ |= 0x00000001;
      return rot;
    }

    /**
     * <code>optional .Vector rot = 9;</code>
     * @param value the rot to set
     * @return this
     */
    public MotionInfo setRot(final VectorOuterClass.Vector value) {
      bitField0_ |= 0x00000001;
      rot.copyFrom(value);
      return this;
    }

    /**
     * <code>optional .Vector pos = 12;</code>
     * @return whether the pos field is set
     */
    public boolean hasPos() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional .Vector pos = 12;</code>
     * @return this
     */
    public MotionInfo clearPos() {
      bitField0_ &= ~0x00000002;
      pos.clear();
      return this;
    }

    /**
     * <code>optional .Vector pos = 12;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutablePos()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public VectorOuterClass.Vector getPos() {
      return pos;
    }

    /**
     * <code>optional .Vector pos = 12;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public VectorOuterClass.Vector getMutablePos() {
      bitField0_ |= 0x00000002;
      return pos;
    }

    /**
     * <code>optional .Vector pos = 12;</code>
     * @param value the pos to set
     * @return this
     */
    public MotionInfo setPos(final VectorOuterClass.Vector value) {
      bitField0_ |= 0x00000002;
      pos.copyFrom(value);
      return this;
    }

    @Override
    public MotionInfo copyFrom(final MotionInfo other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        rot.copyFrom(other.rot);
        pos.copyFrom(other.pos);
      }
      return this;
    }

    @Override
    public MotionInfo mergeFrom(final MotionInfo other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRot()) {
        getMutableRot().mergeFrom(other.rot);
      }
      if (other.hasPos()) {
        getMutablePos().mergeFrom(other.pos);
      }
      return this;
    }

    @Override
    public MotionInfo clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      rot.clear();
      pos.clear();
      return this;
    }

    @Override
    public MotionInfo clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      rot.clearQuick();
      pos.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof MotionInfo)) {
        return false;
      }
      MotionInfo other = (MotionInfo) o;
      return bitField0_ == other.bitField0_
        && (!hasRot() || rot.equals(other.rot))
        && (!hasPos() || pos.equals(other.pos));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 74);
        output.writeMessageNoTag(rot);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 98);
        output.writeMessageNoTag(pos);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(rot);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(pos);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public MotionInfo mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 74: {
            // rot
            input.readMessage(rot);
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 98) {
              break;
            }
          }
          case 98: {
            // pos
            input.readMessage(pos);
            bitField0_ |= 0x00000002;
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
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeMessage(FieldNames.rot, rot);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeMessage(FieldNames.pos, pos);
      }
      output.endObject();
    }

    @Override
    public MotionInfo mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 113111: {
            if (input.isAtField(FieldNames.rot)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(rot);
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 111188: {
            if (input.isAtField(FieldNames.pos)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(pos);
                bitField0_ |= 0x00000002;
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
    public MotionInfo clone() {
      return new MotionInfo().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static MotionInfo parseFrom(final byte[] data) throws InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new MotionInfo(), data).checkInitialized();
    }

    public static MotionInfo parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new MotionInfo(), input).checkInitialized();
    }

    public static MotionInfo parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new MotionInfo(), input).checkInitialized();
    }

    /**
     * @return factory for creating MotionInfo messages
     */
    public static MessageFactory<MotionInfo> getFactory() {
      return MotionInfoFactory.INSTANCE;
    }

    private enum MotionInfoFactory implements MessageFactory<MotionInfo> {
      INSTANCE;

      @Override
      public MotionInfo create() {
        return MotionInfo.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName rot = FieldName.forField("rot");

      static final FieldName pos = FieldName.forField("pos");
    }
  }
}
