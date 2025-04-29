.class public final Lt5/c0$c;
.super Lcom/google/crypto/tink/shaded/protobuf/z;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/t0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt5/c0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt5/c0$c$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/shaded/protobuf/z<",
        "Lt5/c0$c;",
        "Lt5/c0$c$a;",
        ">;",
        "Lcom/google/crypto/tink/shaded/protobuf/t0;"
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Lt5/c0$c;

.field public static final KEY_DATA_FIELD_NUMBER:I = 0x1

.field public static final KEY_ID_FIELD_NUMBER:I = 0x3

.field public static final OUTPUT_PREFIX_TYPE_FIELD_NUMBER:I = 0x4

.field private static volatile PARSER:Lcom/google/crypto/tink/shaded/protobuf/a1; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/shaded/protobuf/a1<",
            "Lt5/c0$c;",
            ">;"
        }
    .end annotation
.end field

.field public static final STATUS_FIELD_NUMBER:I = 0x2


# instance fields
.field private keyData_:Lt5/y;

.field private keyId_:I

.field private outputPrefixType_:I

.field private status_:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lt5/c0$c;

    invoke-direct {v0}, Lt5/c0$c;-><init>()V

    sput-object v0, Lt5/c0$c;->DEFAULT_INSTANCE:Lt5/c0$c;

    const-class v1, Lt5/c0$c;

    invoke-static {v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->L(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/z;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/z;-><init>()V

    return-void
.end method

.method static synthetic N()Lt5/c0$c;
    .locals 1

    sget-object v0, Lt5/c0$c;->DEFAULT_INSTANCE:Lt5/c0$c;

    return-object v0
.end method

.method static synthetic O(Lt5/c0$c;Lt5/y;)V
    .locals 0

    invoke-direct {p0, p1}, Lt5/c0$c;->Y(Lt5/y;)V

    return-void
.end method

.method static synthetic P(Lt5/c0$c;Lt5/i0;)V
    .locals 0

    invoke-direct {p0, p1}, Lt5/c0$c;->a0(Lt5/i0;)V

    return-void
.end method

.method static synthetic Q(Lt5/c0$c;Lt5/z;)V
    .locals 0

    invoke-direct {p0, p1}, Lt5/c0$c;->b0(Lt5/z;)V

    return-void
.end method

.method static synthetic R(Lt5/c0$c;I)V
    .locals 0

    invoke-direct {p0, p1}, Lt5/c0$c;->Z(I)V

    return-void
.end method

.method public static X()Lt5/c0$c$a;
    .locals 1

    sget-object v0, Lt5/c0$c;->DEFAULT_INSTANCE:Lt5/c0$c;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->t()Lcom/google/crypto/tink/shaded/protobuf/z$a;

    move-result-object v0

    check-cast v0, Lt5/c0$c$a;

    return-object v0
.end method

.method private Y(Lt5/y;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lt5/c0$c;->keyData_:Lt5/y;

    return-void
.end method

.method private Z(I)V
    .locals 0

    iput p1, p0, Lt5/c0$c;->keyId_:I

    return-void
.end method

.method private a0(Lt5/i0;)V
    .locals 0

    invoke-virtual {p1}, Lt5/i0;->a()I

    move-result p1

    iput p1, p0, Lt5/c0$c;->outputPrefixType_:I

    return-void
.end method

.method private b0(Lt5/z;)V
    .locals 0

    invoke-virtual {p1}, Lt5/z;->a()I

    move-result p1

    iput p1, p0, Lt5/c0$c;->status_:I

    return-void
.end method


# virtual methods
.method public S()Lt5/y;
    .locals 1

    iget-object v0, p0, Lt5/c0$c;->keyData_:Lt5/y;

    if-nez v0, :cond_0

    invoke-static {}, Lt5/y;->R()Lt5/y;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public T()I
    .locals 1

    iget v0, p0, Lt5/c0$c;->keyId_:I

    return v0
.end method

.method public U()Lt5/i0;
    .locals 1

    iget v0, p0, Lt5/c0$c;->outputPrefixType_:I

    invoke-static {v0}, Lt5/i0;->b(I)Lt5/i0;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lt5/i0;->p:Lt5/i0;

    :cond_0
    return-object v0
.end method

.method public V()Lt5/z;
    .locals 1

    iget v0, p0, Lt5/c0$c;->status_:I

    invoke-static {v0}, Lt5/z;->b(I)Lt5/z;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lt5/z;->o:Lt5/z;

    :cond_0
    return-object v0
.end method

.method public W()Z
    .locals 1

    iget-object v0, p0, Lt5/c0$c;->keyData_:Lt5/y;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected final w(Lcom/google/crypto/tink/shaded/protobuf/z$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Lt5/c0$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, p2, p1

    const/4 p2, 0x1

    const/4 p3, 0x0

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_0
    return-object p3

    :pswitch_1
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1

    :pswitch_2
    sget-object p1, Lt5/c0$c;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/a1;

    if-nez p1, :cond_1

    const-class p2, Lt5/c0$c;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lt5/c0$c;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/a1;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/z$b;

    sget-object p3, Lt5/c0$c;->DEFAULT_INSTANCE:Lt5/c0$c;

    invoke-direct {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/z$b;-><init>(Lcom/google/crypto/tink/shaded/protobuf/z;)V

    sput-object p1, Lt5/c0$c;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/a1;

    :cond_0
    monitor-exit p2

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    :goto_0
    return-object p1

    :pswitch_3
    sget-object p1, Lt5/c0$c;->DEFAULT_INSTANCE:Lt5/c0$c;

    return-object p1

    :pswitch_4
    const/4 p1, 0x4

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "keyData_"

    aput-object v0, p1, p3

    const-string p3, "status_"

    aput-object p3, p1, p2

    const/4 p2, 0x2

    const-string p3, "keyId_"

    aput-object p3, p1, p2

    const/4 p2, 0x3

    const-string p3, "outputPrefixType_"

    aput-object p3, p1, p2

    const-string p2, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\u000c\u0003\u000b\u0004\u000c"

    sget-object p3, Lt5/c0$c;->DEFAULT_INSTANCE:Lt5/c0$c;

    invoke-static {p3, p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/z;->F(Lcom/google/crypto/tink/shaded/protobuf/s0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lt5/c0$c$a;

    invoke-direct {p1, p3}, Lt5/c0$c$a;-><init>(Lt5/c0$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lt5/c0$c;

    invoke-direct {p1}, Lt5/c0$c;-><init>()V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
