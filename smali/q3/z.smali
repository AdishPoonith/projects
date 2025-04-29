.class public final Lq3/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls1/h;


# static fields
.field public static final n:Lq3/z;

.field private static final o:Ljava/lang/String;

.field private static final p:Ljava/lang/String;

.field private static final q:Ljava/lang/String;

.field private static final r:Ljava/lang/String;

.field public static final s:Ls1/h$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ls1/h$a<",
            "Lq3/z;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final j:I

.field public final k:I

.field public final l:I

.field public final m:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lq3/z;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Lq3/z;-><init>(II)V

    sput-object v0, Lq3/z;->n:Lq3/z;

    invoke-static {v1}, Lp3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lq3/z;->o:Ljava/lang/String;

    const/4 v0, 0x1

    invoke-static {v0}, Lp3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lq3/z;->p:Ljava/lang/String;

    const/4 v0, 0x2

    invoke-static {v0}, Lp3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lq3/z;->q:Ljava/lang/String;

    const/4 v0, 0x3

    invoke-static {v0}, Lp3/n0;->q0(I)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lq3/z;->r:Ljava/lang/String;

    sget-object v0, Lq3/y;->a:Lq3/y;

    sput-object v0, Lq3/z;->s:Ls1/h$a;

    return-void
.end method

.method public constructor <init>(II)V
    .locals 2

    const/4 v0, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-direct {p0, p1, p2, v0, v1}, Lq3/z;-><init>(IIIF)V

    return-void
.end method

.method public constructor <init>(IIIF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lq3/z;->j:I

    iput p2, p0, Lq3/z;->k:I

    iput p3, p0, Lq3/z;->l:I

    iput p4, p0, Lq3/z;->m:F

    return-void
.end method

.method public static synthetic a(Landroid/os/Bundle;)Lq3/z;
    .locals 0

    invoke-static {p0}, Lq3/z;->b(Landroid/os/Bundle;)Lq3/z;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic b(Landroid/os/Bundle;)Lq3/z;
    .locals 5

    sget-object v0, Lq3/z;->o:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    sget-object v2, Lq3/z;->p:Ljava/lang/String;

    invoke-virtual {p0, v2, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v2

    sget-object v3, Lq3/z;->q:Ljava/lang/String;

    invoke-virtual {p0, v3, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v1

    sget-object v3, Lq3/z;->r:Ljava/lang/String;

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-virtual {p0, v3, v4}, Landroid/os/Bundle;->getFloat(Ljava/lang/String;F)F

    move-result p0

    new-instance v3, Lq3/z;

    invoke-direct {v3, v0, v2, v1, p0}, Lq3/z;-><init>(IIIF)V

    return-object v3
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lq3/z;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast p1, Lq3/z;

    iget v1, p0, Lq3/z;->j:I

    iget v3, p1, Lq3/z;->j:I

    if-ne v1, v3, :cond_1

    iget v1, p0, Lq3/z;->k:I

    iget v3, p1, Lq3/z;->k:I

    if-ne v1, v3, :cond_1

    iget v1, p0, Lq3/z;->l:I

    iget v3, p1, Lq3/z;->l:I

    if-ne v1, v3, :cond_1

    iget v1, p0, Lq3/z;->m:F

    iget p1, p1, Lq3/z;->m:F

    cmpl-float p1, v1, p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_2
    return v2
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lq3/z;->j:I

    const/16 v1, 0xd9

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lq3/z;->k:I

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lq3/z;->l:I

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget v0, p0, Lq3/z;->m:F

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    add-int/2addr v1, v0

    return v1
.end method
