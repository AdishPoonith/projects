.class public final Lt5/x;
.super Lcom/google/crypto/tink/shaded/protobuf/z;
.source "SourceFile"

# interfaces
.implements Lcom/google/crypto/tink/shaded/protobuf/t0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lt5/x$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/crypto/tink/shaded/protobuf/z<",
        "Lt5/x;",
        "Lt5/x$b;",
        ">;",
        "Lcom/google/crypto/tink/shaded/protobuf/t0;"
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Lt5/x;

.field public static final HASH_FIELD_NUMBER:I = 0x1

.field private static volatile PARSER:Lcom/google/crypto/tink/shaded/protobuf/a1; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/crypto/tink/shaded/protobuf/a1<",
            "Lt5/x;",
            ">;"
        }
    .end annotation
.end field

.field public static final TAG_SIZE_FIELD_NUMBER:I = 0x2


# instance fields
.field private hash_:I

.field private tagSize_:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lt5/x;

    invoke-direct {v0}, Lt5/x;-><init>()V

    sput-object v0, Lt5/x;->DEFAULT_INSTANCE:Lt5/x;

    const-class v1, Lt5/x;

    invoke-static {v1, v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->L(Ljava/lang/Class;Lcom/google/crypto/tink/shaded/protobuf/z;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/crypto/tink/shaded/protobuf/z;-><init>()V

    return-void
.end method

.method static synthetic N()Lt5/x;
    .locals 1

    sget-object v0, Lt5/x;->DEFAULT_INSTANCE:Lt5/x;

    return-object v0
.end method

.method static synthetic O(Lt5/x;Lt5/u;)V
    .locals 0

    invoke-direct {p0, p1}, Lt5/x;->U(Lt5/u;)V

    return-void
.end method

.method static synthetic P(Lt5/x;I)V
    .locals 0

    invoke-direct {p0, p1}, Lt5/x;->V(I)V

    return-void
.end method

.method public static Q()Lt5/x;
    .locals 1

    sget-object v0, Lt5/x;->DEFAULT_INSTANCE:Lt5/x;

    return-object v0
.end method

.method public static T()Lt5/x$b;
    .locals 1

    sget-object v0, Lt5/x;->DEFAULT_INSTANCE:Lt5/x;

    invoke-virtual {v0}, Lcom/google/crypto/tink/shaded/protobuf/z;->t()Lcom/google/crypto/tink/shaded/protobuf/z$a;

    move-result-object v0

    check-cast v0, Lt5/x$b;

    return-object v0
.end method

.method private U(Lt5/u;)V
    .locals 0

    invoke-virtual {p1}, Lt5/u;->a()I

    move-result p1

    iput p1, p0, Lt5/x;->hash_:I

    return-void
.end method

.method private V(I)V
    .locals 0

    iput p1, p0, Lt5/x;->tagSize_:I

    return-void
.end method


# virtual methods
.method public R()Lt5/u;
    .locals 1

    iget v0, p0, Lt5/x;->hash_:I

    invoke-static {v0}, Lt5/u;->b(I)Lt5/u;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lt5/u;->q:Lt5/u;

    :cond_0
    return-object v0
.end method

.method public S()I
    .locals 1

    iget v0, p0, Lt5/x;->tagSize_:I

    return v0
.end method

.method protected final w(Lcom/google/crypto/tink/shaded/protobuf/z$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Lt5/x$a;->a:[I

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
    sget-object p1, Lt5/x;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/a1;

    if-nez p1, :cond_1

    const-class p2, Lt5/x;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lt5/x;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/a1;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/crypto/tink/shaded/protobuf/z$b;

    sget-object p3, Lt5/x;->DEFAULT_INSTANCE:Lt5/x;

    invoke-direct {p1, p3}, Lcom/google/crypto/tink/shaded/protobuf/z$b;-><init>(Lcom/google/crypto/tink/shaded/protobuf/z;)V

    sput-object p1, Lt5/x;->PARSER:Lcom/google/crypto/tink/shaded/protobuf/a1;

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
    sget-object p1, Lt5/x;->DEFAULT_INSTANCE:Lt5/x;

    return-object p1

    :pswitch_4
    const/4 p1, 0x2

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "hash_"

    aput-object v0, p1, p3

    const-string p3, "tagSize_"

    aput-object p3, p1, p2

    const-string p2, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000c\u0002\u000b"

    sget-object p3, Lt5/x;->DEFAULT_INSTANCE:Lt5/x;

    invoke-static {p3, p2, p1}, Lcom/google/crypto/tink/shaded/protobuf/z;->F(Lcom/google/crypto/tink/shaded/protobuf/s0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lt5/x$b;

    invoke-direct {p1, p3}, Lt5/x$b;-><init>(Lt5/x$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lt5/x;

    invoke-direct {p1}, Lt5/x;-><init>()V

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
