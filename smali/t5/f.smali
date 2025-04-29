.class public final Lt5/f;
.super Lcom/google/crypto/tink/shaded/protobuf/z;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/t0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt5/f$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/shaded/protobuf/z<",
        "Lt5/f;",
        "Lt5/f$b;",
        ">;",
        "Lcom/google/crypto/tink/shaded/protobuf/t0;"
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Lt5/f;

.field public static final KEY_VALUE_FIELD_NUMBER:I = 0x3

.field public static final PARAMS_FIELD_NUMBER:I = 0x2

.field private static volatile PARSER:Lcom/google/crypto/tink/shaded/protobuf/a1; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/shaded/protobuf/a1<",
            "Lt5/f;",
            ">;"
        }
    .end annotation
.end field

.field public static final VERSION_FIELD_NUMBER:I = 0x1


# instance fields
.field private keyValue_:Lcom/google/crypto/tink/shaded/protobuf/i;

.field private params_:Lt5/h;

.field private version_:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lt5/f;

    invoke-direct {v0}, Lt5/f;-><init>()V

    sput-object v0, Lt5/f;->DEFAULT_INSTANCE:Lt5/f;

    const-class v1, Lt5/f;

    invoke-static {v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->L(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/z;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/z;-><init>()V

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/i;->k:Lcom/google/crypto/tink/shaded/protobuf/i;

    iput-object v0, p0, Lt5/f;->keyValue_:Lcom/google/crypto/tink/shaded/protobuf/i;

    return-void
.end method

.method static synthetic N()Lt5/f;
    .locals 1

    sget-object v0, Lt5/f;->DEFAULT_INSTANCE:Lt5/f;

    return-object v0
.end method

.method static synthetic O(Lt5/f;I)V
    .locals 0

    invoke-direct {p0, p1}, Lt5/f;->Z(I)V

    return-void
.end method

.method static synthetic P(Lt5/f;Lt5/h;)V
    .locals 0

    invoke-direct {p0, p1}, Lt5/f;->Y(Lt5/h;)V

    return-void
.end method

.method static synthetic Q(Lt5/f;Lcom/google/crypto/tink/shaded/protobuf/i;)V
    .locals 0

    invoke-direct {p0, p1}, Lt5/f;->X(Lcom/google/crypto/tink/shaded/protobuf/i;)V

    return-void
.end method

.method public static R()Lt5/f;
    .locals 1

    sget-object v0, Lt5/f;->DEFAULT_INSTANCE:Lt5/f;

    return-object v0
.end method

.method public static V()Lt5/f$b;
    .locals 1

    sget-object v0, Lt5/f;->DEFAULT_INSTANCE:Lt5/f;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->t()Lcom/google/crypto/tink/shaded/protobuf/z$a;

    move-result-object v0

    check-cast v0, Lt5/f$b;

    return-object v0
.end method

.method public static W(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/q;)Lt5/f;
    .locals 1

    sget-object v0, Lt5/f;->DEFAULT_INSTANCE:Lt5/f;

    invoke-static {v0, p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/z;->G(Lcom/google/crypto/tink/shaded/protobuf/z;Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/q;)Lcom/google/crypto/tink/shaded/protobuf/z;

    move-result-object p0

    check-cast p0, Lt5/f;

    return-object p0
.end method

.method private X(Lcom/google/crypto/tink/shaded/protobuf/i;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lt5/f;->keyValue_:Lcom/google/crypto/tink/shaded/protobuf/i;

    return-void
.end method

.method private Y(Lt5/h;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lt5/f;->params_:Lt5/h;

    return-void
.end method

.method private Z(I)V
    .locals 0

    iput p1, p0, Lt5/f;->version_:I

    return-void
.end method


# virtual methods
.method public S()Lcom/google/crypto/tink/shaded/protobuf/i;
    .locals 1

    iget-object v0, p0, Lt5/f;->keyValue_:Lcom/google/crypto/tink/shaded/protobuf/i;

    return-object v0
.end method

.method public T()Lt5/h;
    .locals 1

    iget-object v0, p0, Lt5/f;->params_:Lt5/h;

    if-nez v0, :cond_0

    invoke-static {}, Lt5/h;->P()Lt5/h;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public U()I
    .locals 1

    iget v0, p0, Lt5/f;->version_:I

    return v0
.end method

.method protected final w(Lcom/google/crypto/tink/shaded/protobuf/z$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Lt5/f$a;->a:[I

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
    sget-object p1, Lt5/f;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/a1;

    if-nez p1, :cond_1

    const-class p2, Lt5/f;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lt5/f;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/a1;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/z$b;

    sget-object p3, Lt5/f;->DEFAULT_INSTANCE:Lt5/f;

    invoke-direct {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/z$b;-><init>(Lcom/google/crypto/tink/shaded/protobuf/z;)V

    sput-object p1, Lt5/f;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/a1;

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
    sget-object p1, Lt5/f;->DEFAULT_INSTANCE:Lt5/f;

    return-object p1

    :pswitch_4
    const/4 p1, 0x3

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "version_"

    aput-object v0, p1, p3

    const-string p3, "params_"

    aput-object p3, p1, p2

    const/4 p2, 0x2

    const-string p3, "keyValue_"

    aput-object p3, p1, p2

    const-string p2, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n"

    sget-object p3, Lt5/f;->DEFAULT_INSTANCE:Lt5/f;

    invoke-static {p3, p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/z;->F(Lcom/google/crypto/tink/shaded/protobuf/s0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lt5/f$b;

    invoke-direct {p1, p3}, Lt5/f$b;-><init>(Lt5/f$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lt5/f;

    invoke-direct {p1}, Lt5/f;-><init>()V

    return-object p1

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
