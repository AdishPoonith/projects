.class public final Lg5/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg5/k$b;
    }
.end annotation


# instance fields
.field private final a:Lt5/a0;


# direct methods
.method private constructor <init>(Lt5/a0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg5/k;->a:Lt5/a0;

    return-void
.end method

.method public static a(Ljava/lang/String;[BLg5/k$b;)Lg5/k;
    .locals 2

    new-instance v0, Lg5/k;

    invoke-static {}, Lt5/a0;->V()Lt5/a0$b;

    move-result-object v1

    invoke-virtual {v1, p0}, Lt5/a0$b;->C(Ljava/lang/String;)Lt5/a0$b;

    move-result-object p0

    invoke-static {p1}, Lcom/google/crypto/tink/shaded/protobuf/i;->m([B)Lcom/google/crypto/tink/shaded/protobuf/i;

    move-result-object p1

    invoke-virtual {p0, p1}, Lt5/a0$b;->D(Lcom/google/crypto/tink/shaded/protobuf/i;)Lt5/a0$b;

    move-result-object p0

    invoke-static {p2}, Lg5/k;->c(Lg5/k$b;)Lt5/i0;

    move-result-object p1

    invoke-virtual {p0, p1}, Lt5/a0$b;->B(Lt5/i0;)Lt5/a0$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/crypto/tink/shaded/protobuf/z$a;->s()Lcom/google/crypto/tink/shaded/protobuf/z;

    move-result-object p0

    check-cast p0, Lt5/a0;

    invoke-direct {v0, p0}, Lg5/k;-><init>(Lt5/a0;)V

    return-object v0
.end method

.method static c(Lg5/k$b;)Lt5/i0;
    .locals 1

    sget-object v0, Lg5/k$a;->b:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_3

    const/4 v0, 0x2

    if-eq p0, v0, :cond_2

    const/4 v0, 0x3

    if-eq p0, v0, :cond_1

    const/4 v0, 0x4

    if-ne p0, v0, :cond_0

    sget-object p0, Lt5/i0;->o:Lt5/i0;

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unknown output prefix type"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    sget-object p0, Lt5/i0;->n:Lt5/i0;

    return-object p0

    :cond_2
    sget-object p0, Lt5/i0;->m:Lt5/i0;

    return-object p0

    :cond_3
    sget-object p0, Lt5/i0;->l:Lt5/i0;

    return-object p0
.end method


# virtual methods
.method b()Lt5/a0;
    .locals 1

    iget-object v0, p0, Lg5/k;->a:Lt5/a0;

    return-object v0
.end method
