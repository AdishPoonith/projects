.class public final Lt5/c0;
.super Lcom/google/crypto/tink/shaded/protobuf/z;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/t0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt5/c0$b;,
        Lt5/c0$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/shaded/protobuf/z<",
        "Lt5/c0;",
        "Lt5/c0$b;",
        ">;",
        "Lcom/google/crypto/tink/shaded/protobuf/t0;"
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Lt5/c0;

.field public static final KEY_FIELD_NUMBER:I = 0x2

.field private static volatile PARSER:Lcom/google/crypto/tink/shaded/protobuf/a1; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/shaded/protobuf/a1<",
            "Lt5/c0;",
            ">;"
        }
    .end annotation
.end field

.field public static final PRIMARY_KEY_ID_FIELD_NUMBER:I = 0x1


# instance fields
.field private key_:Lcom/google/crypto/tink/shaded/protobuf/b0$i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/shaded/protobuf/b0$i<",
            "Lt5/c0$c;",
            ">;"
        }
    .end annotation
.end field

.field private primaryKeyId_:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lt5/c0;

    invoke-direct {v0}, Lt5/c0;-><init>()V

    sput-object v0, Lt5/c0;->DEFAULT_INSTANCE:Lt5/c0;

    const-class v1, Lt5/c0;

    invoke-static {v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->L(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/z;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/z;-><init>()V

    invoke-static {}, Lcom/google/crypto/tink/shaded/protobuf/z;->x()Lcom/google/crypto/tink/shaded/protobuf/b0$i;

    move-result-object v0

    iput-object v0, p0, Lt5/c0;->key_:Lcom/google/crypto/tink/shaded/protobuf/b0$i;

    return-void
.end method

.method static synthetic N()Lt5/c0;
    .locals 1

    sget-object v0, Lt5/c0;->DEFAULT_INSTANCE:Lt5/c0;

    return-object v0
.end method

.method static synthetic O(Lt5/c0;I)V
    .locals 0

    invoke-direct {p0, p1}, Lt5/c0;->Y(I)V

    return-void
.end method

.method static synthetic P(Lt5/c0;Lt5/c0$c;)V
    .locals 0

    invoke-direct {p0, p1}, Lt5/c0;->Q(Lt5/c0$c;)V

    return-void
.end method

.method private Q(Lt5/c0$c;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {p0}, Lt5/c0;->R()V

    iget-object v0, p0, Lt5/c0;->key_:Lcom/google/crypto/tink/shaded/protobuf/b0$i;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private R()V
    .locals 2

    iget-object v0, p0, Lt5/c0;->key_:Lcom/google/crypto/tink/shaded/protobuf/b0$i;

    invoke-interface {v0}, Lcom/google/crypto/tink/shaded/protobuf/b0$i;->h()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->D(Lcom/google/crypto/tink/shaded/protobuf/b0$i;)Lcom/google/crypto/tink/shaded/protobuf/b0$i;

    move-result-object v0

    iput-object v0, p0, Lt5/c0;->key_:Lcom/google/crypto/tink/shaded/protobuf/b0$i;

    :cond_0
    return-void
.end method

.method public static W()Lt5/c0$b;
    .locals 1

    sget-object v0, Lt5/c0;->DEFAULT_INSTANCE:Lt5/c0;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->t()Lcom/google/crypto/tink/shaded/protobuf/z$a;

    move-result-object v0

    check-cast v0, Lt5/c0$b;

    return-object v0
.end method

.method public static X([BLcom/google/crypto/tink/shaded/protobuf/q;)Lt5/c0;
    .locals 1

    sget-object v0, Lt5/c0;->DEFAULT_INSTANCE:Lt5/c0;

    invoke-static {v0, p0, p1}, Lcom/google/crypto/tink/shaded/protobuf/z;->H(Lcom/google/crypto/tink/shaded/protobuf/z;[BLcom/google/crypto/tink/shaded/protobuf/q;)Lcom/google/crypto/tink/shaded/protobuf/z;

    move-result-object p0

    check-cast p0, Lt5/c0;

    return-object p0
.end method

.method private Y(I)V
    .locals 0

    iput p1, p0, Lt5/c0;->primaryKeyId_:I

    return-void
.end method


# virtual methods
.method public S(I)Lt5/c0$c;
    .locals 1

    iget-object v0, p0, Lt5/c0;->key_:Lcom/google/crypto/tink/shaded/protobuf/b0$i;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lt5/c0$c;

    return-object p1
.end method

.method public T()I
    .locals 1

    iget-object v0, p0, Lt5/c0;->key_:Lcom/google/crypto/tink/shaded/protobuf/b0$i;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public U()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lt5/c0$c;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lt5/c0;->key_:Lcom/google/crypto/tink/shaded/protobuf/b0$i;

    return-object v0
.end method

.method public V()I
    .locals 1

    iget v0, p0, Lt5/c0;->primaryKeyId_:I

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
    sget-object p1, Lt5/c0;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/a1;

    if-nez p1, :cond_1

    const-class p2, Lt5/c0;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lt5/c0;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/a1;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/z$b;

    sget-object p3, Lt5/c0;->DEFAULT_INSTANCE:Lt5/c0;

    invoke-direct {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/z$b;-><init>(Lcom/google/crypto/tink/shaded/protobuf/z;)V

    sput-object p1, Lt5/c0;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/a1;

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
    sget-object p1, Lt5/c0;->DEFAULT_INSTANCE:Lt5/c0;

    return-object p1

    :pswitch_4
    const/4 p1, 0x3

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "primaryKeyId_"

    aput-object v0, p1, p3

    const-string p3, "key_"

    aput-object p3, p1, p2

    const/4 p2, 0x2

    const-class p3, Lt5/c0$c;

    aput-object p3, p1, p2

    const-string p2, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b"

    sget-object p3, Lt5/c0;->DEFAULT_INSTANCE:Lt5/c0;

    invoke-static {p3, p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/z;->F(Lcom/google/crypto/tink/shaded/protobuf/s0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lt5/c0$b;

    invoke-direct {p1, p3}, Lt5/c0$b;-><init>(Lt5/c0$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lt5/c0;

    invoke-direct {p1}, Lt5/c0;-><init>()V

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
