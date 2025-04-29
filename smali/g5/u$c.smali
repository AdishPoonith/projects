.class public final Lg5/u$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg5/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<P:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TP;"
        }
    .end annotation
.end field

.field private final b:[B

.field private final c:Lt5/z;

.field private final d:Lt5/i0;

.field private final e:I

.field private final f:Lg5/f;


# direct methods
.method constructor <init>(Ljava/lang/Object;[BLt5/z;Lt5/i0;ILg5/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TP;[B",
            "Lt5/z;",
            "Lt5/i0;",
            "I",
            "Lg5/f;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg5/u$c;->a:Ljava/lang/Object;

    array-length p1, p2

    invoke-static {p2, p1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p1

    iput-object p1, p0, Lg5/u$c;->b:[B

    iput-object p3, p0, Lg5/u$c;->c:Lt5/z;

    iput-object p4, p0, Lg5/u$c;->d:Lt5/i0;

    iput p5, p0, Lg5/u$c;->e:I

    iput-object p6, p0, Lg5/u$c;->f:Lg5/f;

    return-void
.end method


# virtual methods
.method public final a()[B
    .locals 2

    iget-object v0, p0, Lg5/u$c;->b:[B

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    return-object v0
.end method

.method public b()Lg5/f;
    .locals 1

    iget-object v0, p0, Lg5/u$c;->f:Lg5/f;

    return-object v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lg5/u$c;->e:I

    return v0
.end method

.method public d()Lt5/i0;
    .locals 1

    iget-object v0, p0, Lg5/u$c;->d:Lt5/i0;

    return-object v0
.end method

.method public e()Lg5/t;
    .locals 1

    iget-object v0, p0, Lg5/u$c;->f:Lg5/f;

    invoke-virtual {v0}, Lg5/f;->a()Lg5/t;

    move-result-object v0

    return-object v0
.end method

.method public f()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TP;"
        }
    .end annotation

    iget-object v0, p0, Lg5/u$c;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public g()Lt5/z;
    .locals 1

    iget-object v0, p0, Lg5/u$c;->c:Lt5/z;

    return-object v0
.end method
