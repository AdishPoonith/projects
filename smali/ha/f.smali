.class public final Lha/f;
.super Lha/d;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lha/f$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lha/d;"
    }
.end annotation


# static fields
.field public static final n:Lha/f$a;

.field private static final o:Lha/f;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lha/f$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lha/f$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lha/f;->n:Lha/f$a;

    new-instance v0, Lha/f;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lha/f;-><init>(II)V

    sput-object v0, Lha/f;->o:Lha/f;

    return-void
.end method

.method public constructor <init>(II)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, v0}, Lha/d;-><init>(III)V

    return-void
.end method

.method public static final synthetic m()Lha/f;
    .locals 1

    sget-object v0, Lha/f;->o:Lha/f;

    return-object v0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lha/f;

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lha/f;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lha/f;

    invoke-virtual {v0}, Lha/f;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    invoke-virtual {p0}, Lha/d;->b()I

    move-result v0

    check-cast p1, Lha/f;

    invoke-virtual {p1}, Lha/d;->b()I

    move-result v1

    if-ne v0, v1, :cond_2

    invoke-virtual {p0}, Lha/d;->e()I

    move-result v0

    invoke-virtual {p1}, Lha/d;->e()I

    move-result p1

    if-ne v0, p1, :cond_2

    :cond_1
    const/4 p1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Lha/f;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lha/d;->b()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Lha/d;->e()I

    move-result v1

    add-int/2addr v0, v1

    :goto_0
    return v0
.end method

.method public isEmpty()Z
    .locals 2

    invoke-virtual {p0}, Lha/d;->b()I

    move-result v0

    invoke-virtual {p0}, Lha/d;->e()I

    move-result v1

    if-le v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public p(I)Z
    .locals 1

    invoke-virtual {p0}, Lha/d;->b()I

    move-result v0

    if-gt v0, p1, :cond_0

    invoke-virtual {p0}, Lha/d;->e()I

    move-result v0

    if-gt p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public q()Ljava/lang/Integer;
    .locals 1

    invoke-virtual {p0}, Lha/d;->e()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public r()Ljava/lang/Integer;
    .locals 1

    invoke-virtual {p0}, Lha/d;->b()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lha/d;->b()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ".."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lha/d;->e()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
