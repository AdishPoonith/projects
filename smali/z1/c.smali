.class final Lz1/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz1/a;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:I


# direct methods
.method private constructor <init>(IIII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lz1/c;->a:I

    iput p2, p0, Lz1/c;->b:I

    iput p3, p0, Lz1/c;->c:I

    iput p4, p0, Lz1/c;->d:I

    return-void
.end method

.method public static c(Lp3/a0;)Lz1/c;
    .locals 5

    invoke-virtual {p0}, Lp3/a0;->t()I

    move-result v0

    const/16 v1, 0x8

    invoke-virtual {p0, v1}, Lp3/a0;->U(I)V

    invoke-virtual {p0}, Lp3/a0;->t()I

    move-result v1

    invoke-virtual {p0}, Lp3/a0;->t()I

    move-result v2

    const/4 v3, 0x4

    invoke-virtual {p0, v3}, Lp3/a0;->U(I)V

    invoke-virtual {p0}, Lp3/a0;->t()I

    move-result v3

    const/16 v4, 0xc

    invoke-virtual {p0, v4}, Lp3/a0;->U(I)V

    new-instance p0, Lz1/c;

    invoke-direct {p0, v0, v1, v2, v3}, Lz1/c;-><init>(IIII)V

    return-object p0
.end method


# virtual methods
.method public a()I
    .locals 1

    const v0, 0x68697661

    return v0
.end method

.method public b()Z
    .locals 2

    iget v0, p0, Lz1/c;->b:I

    const/16 v1, 0x10

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
