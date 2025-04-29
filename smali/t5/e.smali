.class public final Lt5/e;
.super Lcom/google/crypto/tink/shaded/protobuf/z;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/t0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt5/e$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/shaded/protobuf/z<",
        "Lt5/e;",
        "Lt5/e$b;",
        ">;",
        "Lcom/google/crypto/tink/shaded/protobuf/t0;"
    }
.end annotation


# static fields
.field public static final AES_CTR_KEY_FORMAT_FIELD_NUMBER:I = 0x1

.field private static final DEFAULT_INSTANCE:Lt5/e;

.field public static final HMAC_KEY_FORMAT_FIELD_NUMBER:I = 0x2

.field private static volatile PARSER:Lcom/google/crypto/tink/shaded/protobuf/a1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/shaded/protobuf/a1<",
            "Lt5/e;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private aesCtrKeyFormat_:Lt5/g;

.field private hmacKeyFormat_:Lt5/w;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lt5/e;

    invoke-direct {v0}, Lt5/e;-><init>()V

    sput-object v0, Lt5/e;->DEFAULT_INSTANCE:Lt5/e;

    const-class v1, Lt5/e;

    invoke-static {v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->L(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/z;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/z;-><init>()V

    return-void
.end method

.method static synthetic N()Lt5/e;
    .locals 1

    sget-object v0, Lt5/e;->DEFAULT_INSTANCE:Lt5/e;

    return-object v0
.end method

.method static synthetic O(Lt5/e;Lt5/g;)V
    .locals 0

    invoke-direct {p0, p1}, Lt5/e;->U(Lt5/g;)V

    return-void
.end method

.method static synthetic P(Lt5/e;Lt5/w;)V
    .locals 0

    invoke-direct {p0, p1}, Lt5/e;->V(Lt5/w;)V

    return-void
.end method

.method public static S()Lt5/e$b;
    .locals 1

    sget-object v0, Lt5/e;->DEFAULT_INSTANCE:Lt5/e;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->t()Lcom/google/crypto/tink/shaded/protobuf/z$a;

    move-result-object v0

    check-cast v0, Lt5/e$b;

    return-object v0
.end method

.method public static T(Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/q;)Lt5/e;
    .locals 1

    sget-object v0, Lt5/e;->DEFAULT_INSTANCE:Lt5/e;

    invoke-static {v0, p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/z;->G(Lcom/google/crypto/tink/shaded/protobuf/z;Lcom/google/crypto/tink/shaded/protobuf/i;Lcom/google/crypto/tink/shaded/protobuf/q;)Lcom/google/crypto/tink/shaded/protobuf/z;

    move-result-object p0

    check-cast p0, Lt5/e;

    return-object p0
.end method

.method private U(Lt5/g;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lt5/e;->aesCtrKeyFormat_:Lt5/g;

    return-void
.end method

.method private V(Lt5/w;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lt5/e;->hmacKeyFormat_:Lt5/w;

    return-void
.end method


# virtual methods
.method public Q()Lt5/g;
    .locals 1

    iget-object v0, p0, Lt5/e;->aesCtrKeyFormat_:Lt5/g;

    if-nez v0, :cond_0

    invoke-static {}, Lt5/g;->Q()Lt5/g;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public R()Lt5/w;
    .locals 1

    iget-object v0, p0, Lt5/e;->hmacKeyFormat_:Lt5/w;

    if-nez v0, :cond_0

    invoke-static {}, Lt5/w;->Q()Lt5/w;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method protected final w(Lcom/google/crypto/tink/shaded/protobuf/z$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Lt5/e$a;->a:[I

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
    sget-object p1, Lt5/e;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/a1;

    if-nez p1, :cond_1

    const-class p2, Lt5/e;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lt5/e;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/a1;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/z$b;

    sget-object p3, Lt5/e;->DEFAULT_INSTANCE:Lt5/e;

    invoke-direct {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/z$b;-><init>(Lcom/google/crypto/tink/shaded/protobuf/z;)V

    sput-object p1, Lt5/e;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/a1;

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
    sget-object p1, Lt5/e;->DEFAULT_INSTANCE:Lt5/e;

    return-object p1

    :pswitch_4
    const/4 p1, 0x2

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "aesCtrKeyFormat_"

    aput-object v0, p1, p3

    const-string p3, "hmacKeyFormat_"

    aput-object p3, p1, p2

    const-string p2, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t"

    sget-object p3, Lt5/e;->DEFAULT_INSTANCE:Lt5/e;

    invoke-static {p3, p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/z;->F(Lcom/google/crypto/tink/shaded/protobuf/s0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lt5/e$b;

    invoke-direct {p1, p3}, Lt5/e$b;-><init>(Lt5/e$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lt5/e;

    invoke-direct {p1}, Lt5/e;-><init>()V

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
