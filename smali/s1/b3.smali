.class public final Ls1/b3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls1/h;


# static fields
.field public static final m:Ls1/b3;

.field private static final n:Ljava/lang/String;

.field private static final o:Ljava/lang/String;

.field public static final p:Ls1/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls1/h$a<",
            "Ls1/b3;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final j:F

.field public final k:F

.field private final l:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ls1/b3;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-direct {v0, v1}, Ls1/b3;-><init>(F)V

    sput-object v0, Ls1/b3;->m:Ls1/b3;

    const/4 v0, 0x0

    invoke-static {v0}, Lp3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls1/b3;->n:Ljava/lang/String;

    const/4 v0, 0x1

    invoke-static {v0}, Lp3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls1/b3;->o:Ljava/lang/String;

    sget-object v0, Ls1/a3;->a:Ls1/a3;

    sput-object v0, Ls1/b3;->p:Ls1/h$a;

    return-void
.end method

.method public constructor <init>(F)V
    .locals 1

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-direct {p0, p1, v0}, Ls1/b3;-><init>(FF)V

    return-void
.end method

.method public constructor <init>(FF)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    cmpl-float v3, p1, v2

    if-lez v3, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    invoke-static {v3}, Lp3/a;->a(Z)V

    cmpl-float v2, p2, v2

    if-lez v2, :cond_1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-static {v0}, Lp3/a;->a(Z)V

    iput p1, p0, Ls1/b3;->j:F

    iput p2, p0, Ls1/b3;->k:F

    const/high16 p2, 0x447a0000    # 1000.0f

    mul-float p1, p1, p2

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    iput p1, p0, Ls1/b3;->l:I

    return-void
.end method

.method public static synthetic a(Landroid/os/Bundle;)Ls1/b3;
    .locals 0

    invoke-static {p0}, Ls1/b3;->c(Landroid/os/Bundle;)Ls1/b3;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic c(Landroid/os/Bundle;)Ls1/b3;
    .locals 3

    sget-object v0, Ls1/b3;->n:Ljava/lang/String;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {p0, v0, v1}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    move-result v0

    sget-object v2, Ls1/b3;->o:Ljava/lang/String;

    invoke-virtual {p0, v2, v1}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    move-result p0

    new-instance v1, Ls1/b3;

    invoke-direct {v1, v0, p0}, Ls1/b3;-><init>(FF)V

    return-object v1
.end method


# virtual methods
.method public b(J)J
    .locals 2

    iget v0, p0, Ls1/b3;->l:I

    int-to-long v0, v0

    mul-long p1, p1, v0

    return-wide p1
.end method

.method public d(F)Ls1/b3;
    .locals 2

    new-instance v0, Ls1/b3;

    iget v1, p0, Ls1/b3;->k:F

    invoke-direct {v0, p1, v1}, Ls1/b3;-><init>(FF)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    const-class v2, Ls1/b3;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Ls1/b3;

    iget v2, p0, Ls1/b3;->j:F

    iget v3, p1, Ls1/b3;->j:F

    cmpl-float v2, v2, v3

    if-nez v2, :cond_2

    iget v2, p0, Ls1/b3;->k:F

    iget p1, p1, Ls1/b3;->k:F

    cmpl-float p1, v2, p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_3
    :goto_1
    return v1
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Ls1/b3;->j:F

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    const/16 v1, 0x20f

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Ls1/b3;->k:F

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    iget v1, p0, Ls1/b3;->j:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget v1, p0, Ls1/b3;->k:F

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    const/4 v2, 0x1

    aput-object v1, v0, v2

    const-string v1, "PlaybackParameters(speed=%.2f, pitch=%.2f)"

    invoke-static {v1, v0}, Lp3/n0;->C(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
