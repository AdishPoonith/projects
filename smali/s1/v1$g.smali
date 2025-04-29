.class public final Ls1/v1$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls1/h;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls1/v1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "g"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls1/v1$g$a;
    }
.end annotation


# static fields
.field public static final o:Ls1/v1$g;

.field private static final p:Ljava/lang/String;

.field private static final q:Ljava/lang/String;

.field private static final r:Ljava/lang/String;

.field private static final s:Ljava/lang/String;

.field private static final t:Ljava/lang/String;

.field public static final u:Ls1/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls1/h$a<",
            "Ls1/v1$g;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final j:J

.field public final k:J

.field public final l:J

.field public final m:F

.field public final n:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ls1/v1$g$a;

    invoke-direct {v0}, Ls1/v1$g$a;-><init>()V

    invoke-virtual {v0}, Ls1/v1$g$a;->f()Ls1/v1$g;

    move-result-object v0

    sput-object v0, Ls1/v1$g;->o:Ls1/v1$g;

    const/4 v0, 0x0

    invoke-static {v0}, Lp3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls1/v1$g;->p:Ljava/lang/String;

    const/4 v0, 0x1

    invoke-static {v0}, Lp3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls1/v1$g;->q:Ljava/lang/String;

    const/4 v0, 0x2

    invoke-static {v0}, Lp3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls1/v1$g;->r:Ljava/lang/String;

    const/4 v0, 0x3

    invoke-static {v0}, Lp3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls1/v1$g;->s:Ljava/lang/String;

    const/4 v0, 0x4

    invoke-static {v0}, Lp3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ls1/v1$g;->t:Ljava/lang/String;

    sget-object v0, Ls1/x1;->a:Ls1/x1;

    sput-object v0, Ls1/v1$g;->u:Ls1/h$a;

    return-void
.end method

.method public constructor <init>(JJJFF)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Ls1/v1$g;->j:J

    iput-wide p3, p0, Ls1/v1$g;->k:J

    iput-wide p5, p0, Ls1/v1$g;->l:J

    iput p7, p0, Ls1/v1$g;->m:F

    iput p8, p0, Ls1/v1$g;->n:F

    return-void
.end method

.method private constructor <init>(Ls1/v1$g$a;)V
    .locals 9

    invoke-static {p1}, Ls1/v1$g$a;->a(Ls1/v1$g$a;)J

    move-result-wide v1

    invoke-static {p1}, Ls1/v1$g$a;->b(Ls1/v1$g$a;)J

    move-result-wide v3

    invoke-static {p1}, Ls1/v1$g$a;->c(Ls1/v1$g$a;)J

    move-result-wide v5

    invoke-static {p1}, Ls1/v1$g$a;->d(Ls1/v1$g$a;)F

    move-result v7

    invoke-static {p1}, Ls1/v1$g$a;->e(Ls1/v1$g$a;)F

    move-result v8

    move-object v0, p0

    invoke-direct/range {v0 .. v8}, Ls1/v1$g;-><init>(JJJFF)V

    return-void
.end method

.method synthetic constructor <init>(Ls1/v1$g$a;Ls1/v1$a;)V
    .locals 0

    invoke-direct {p0, p1}, Ls1/v1$g;-><init>(Ls1/v1$g$a;)V

    return-void
.end method

.method public static synthetic a(Landroid/os/Bundle;)Ls1/v1$g;
    .locals 0

    invoke-static {p0}, Ls1/v1$g;->c(Landroid/os/Bundle;)Ls1/v1$g;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic c(Landroid/os/Bundle;)Ls1/v1$g;
    .locals 10

    new-instance v9, Ls1/v1$g;

    sget-object v0, Ls1/v1$g;->p:Ljava/lang/String;

    sget-object v1, Ls1/v1$g;->o:Ls1/v1$g;

    iget-wide v2, v1, Ls1/v1$g;->j:J

    invoke-virtual {p0, v0, v2, v3}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v2

    sget-object v0, Ls1/v1$g;->q:Ljava/lang/String;

    iget-wide v4, v1, Ls1/v1$g;->k:J

    invoke-virtual {p0, v0, v4, v5}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v4

    sget-object v0, Ls1/v1$g;->r:Ljava/lang/String;

    iget-wide v6, v1, Ls1/v1$g;->l:J

    invoke-virtual {p0, v0, v6, v7}, Landroid/os/Bundle;->getLong(Ljava/lang/String;J)J

    move-result-wide v6

    sget-object v0, Ls1/v1$g;->s:Ljava/lang/String;

    iget v8, v1, Ls1/v1$g;->m:F

    invoke-virtual {p0, v0, v8}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    move-result v8

    sget-object v0, Ls1/v1$g;->t:Ljava/lang/String;

    iget v1, v1, Ls1/v1$g;->n:F

    invoke-virtual {p0, v0, v1}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    move-result p0

    move-object v0, v9

    move-wide v1, v2

    move-wide v3, v4

    move-wide v5, v6

    move v7, v8

    move v8, p0

    invoke-direct/range {v0 .. v8}, Ls1/v1$g;-><init>(JJJFF)V

    return-object v9
.end method


# virtual methods
.method public b()Ls1/v1$g$a;
    .locals 2

    new-instance v0, Ls1/v1$g$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ls1/v1$g$a;-><init>(Ls1/v1$g;Ls1/v1$a;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Ls1/v1$g;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Ls1/v1$g;

    iget-wide v3, p0, Ls1/v1$g;->j:J

    iget-wide v5, p1, Ls1/v1$g;->j:J

    cmp-long v1, v3, v5

    if-nez v1, :cond_2

    iget-wide v3, p0, Ls1/v1$g;->k:J

    iget-wide v5, p1, Ls1/v1$g;->k:J

    cmp-long v1, v3, v5

    if-nez v1, :cond_2

    iget-wide v3, p0, Ls1/v1$g;->l:J

    iget-wide v5, p1, Ls1/v1$g;->l:J

    cmp-long v1, v3, v5

    if-nez v1, :cond_2

    iget v1, p0, Ls1/v1$g;->m:F

    iget v3, p1, Ls1/v1$g;->m:F

    cmpl-float v1, v1, v3

    if-nez v1, :cond_2

    iget v1, p0, Ls1/v1$g;->n:F

    iget p1, p1, Ls1/v1$g;->n:F

    cmpl-float p1, v1, p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 7

    iget-wide v0, p0, Ls1/v1$g;->j:J

    const/16 v2, 0x20

    ushr-long v3, v0, v2

    xor-long/2addr v0, v3

    long-to-int v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-wide v3, p0, Ls1/v1$g;->k:J

    ushr-long v5, v3, v2

    xor-long/2addr v3, v5

    long-to-int v0, v3

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-wide v3, p0, Ls1/v1$g;->l:J

    ushr-long v5, v3, v2

    xor-long v2, v3, v5

    long-to-int v0, v2

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Ls1/v1$g;->m:F

    const/4 v2, 0x0

    const/4 v3, 0x0

    cmpl-float v4, v0, v3

    if-eqz v4, :cond_0

    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Ls1/v1$g;->n:F

    cmpl-float v3, v0, v3

    if-eqz v3, :cond_1

    invoke-static {v0}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v2

    :cond_1
    add-int/2addr v1, v2

    return v1
.end method
