.class final Landroidx/core/content/res/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final k:Landroidx/core/content/res/l;


# instance fields
.field private final a:F

.field private final b:F

.field private final c:F

.field private final d:F

.field private final e:F

.field private final f:F

.field private final g:[F

.field private final h:F

.field private final i:F

.field private final j:F


# direct methods
.method static constructor <clinit>()V
    .locals 6

    sget-object v0, Landroidx/core/content/res/b;->c:[F

    const/high16 v1, 0x42480000    # 50.0f

    invoke-static {v1}, Landroidx/core/content/res/b;->h(F)F

    move-result v2

    float-to-double v2, v2

    const-wide v4, 0x404fd4bbab8b494cL    # 63.66197723675813

    mul-double v2, v2, v4

    const-wide/high16 v4, 0x4059000000000000L    # 100.0

    div-double/2addr v2, v4

    double-to-float v2, v2

    const/high16 v3, 0x40000000    # 2.0f

    const/4 v4, 0x0

    invoke-static {v0, v2, v1, v3, v4}, Landroidx/core/content/res/l;->k([FFFFZ)Landroidx/core/content/res/l;

    move-result-object v0

    sput-object v0, Landroidx/core/content/res/l;->k:Landroidx/core/content/res/l;

    return-void
.end method

.method private constructor <init>(FFFFFF[FFFF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Landroidx/core/content/res/l;->f:F

    iput p2, p0, Landroidx/core/content/res/l;->a:F

    iput p3, p0, Landroidx/core/content/res/l;->b:F

    iput p4, p0, Landroidx/core/content/res/l;->c:F

    iput p5, p0, Landroidx/core/content/res/l;->d:F

    iput p6, p0, Landroidx/core/content/res/l;->e:F

    iput-object p7, p0, Landroidx/core/content/res/l;->g:[F

    iput p8, p0, Landroidx/core/content/res/l;->h:F

    iput p9, p0, Landroidx/core/content/res/l;->i:F

    iput p10, p0, Landroidx/core/content/res/l;->j:F

    return-void
.end method

.method static k([FFFFZ)Landroidx/core/content/res/l;
    .locals 21

    move/from16 v0, p1

    sget-object v1, Landroidx/core/content/res/b;->a:[[F

    const/4 v2, 0x0

    aget v3, p0, v2

    aget-object v4, v1, v2

    aget v4, v4, v2

    mul-float v3, v3, v4

    const/4 v4, 0x1

    aget v5, p0, v4

    aget-object v6, v1, v2

    aget v6, v6, v4

    mul-float v5, v5, v6

    add-float/2addr v3, v5

    const/4 v5, 0x2

    aget v6, p0, v5

    aget-object v7, v1, v2

    aget v7, v7, v5

    mul-float v6, v6, v7

    add-float/2addr v3, v6

    aget v6, p0, v2

    aget-object v7, v1, v4

    aget v7, v7, v2

    mul-float v6, v6, v7

    aget v7, p0, v4

    aget-object v8, v1, v4

    aget v8, v8, v4

    mul-float v7, v7, v8

    add-float/2addr v6, v7

    aget v7, p0, v5

    aget-object v8, v1, v4

    aget v8, v8, v5

    mul-float v7, v7, v8

    add-float/2addr v6, v7

    aget v7, p0, v2

    aget-object v8, v1, v5

    aget v8, v8, v2

    mul-float v7, v7, v8

    aget v8, p0, v4

    aget-object v9, v1, v5

    aget v9, v9, v4

    mul-float v8, v8, v9

    add-float/2addr v7, v8

    aget v8, p0, v5

    aget-object v1, v1, v5

    aget v1, v1, v5

    mul-float v8, v8, v1

    add-float/2addr v7, v8

    const/high16 v1, 0x41200000    # 10.0f

    div-float v8, p3, v1

    const v9, 0x3f4ccccd    # 0.8f

    add-float/2addr v8, v9

    float-to-double v10, v8

    const v12, 0x3f170a3d    # 0.59f

    const-wide v13, 0x3feccccccccccccdL    # 0.9

    cmpl-double v15, v10, v13

    if-ltz v15, :cond_0

    const v9, 0x3f30a3d7    # 0.69f

    const v10, 0x3f666666    # 0.9f

    sub-float v10, v8, v10

    mul-float v10, v10, v1

    invoke-static {v12, v9, v10}, Landroidx/core/content/res/b;->d(FFF)F

    move-result v1

    goto :goto_0

    :cond_0
    const v10, 0x3f066666    # 0.525f

    sub-float v9, v8, v9

    mul-float v9, v9, v1

    invoke-static {v10, v12, v9}, Landroidx/core/content/res/b;->d(FFF)F

    move-result v1

    :goto_0
    move v15, v1

    const/high16 v1, 0x3f800000    # 1.0f

    if-eqz p4, :cond_1

    const/high16 v9, 0x3f800000    # 1.0f

    goto :goto_1

    :cond_1
    const v9, 0x3e8e38e4

    neg-float v10, v0

    const/high16 v11, 0x42280000    # 42.0f

    sub-float/2addr v10, v11

    const/high16 v11, 0x42b80000    # 92.0f

    div-float/2addr v10, v11

    float-to-double v10, v10

    invoke-static {v10, v11}, Ljava/lang/Math;->exp(D)D

    move-result-wide v10

    double-to-float v10, v10

    mul-float v10, v10, v9

    sub-float v9, v1, v10

    mul-float v9, v9, v8

    :goto_1
    float-to-double v10, v9

    const-wide/high16 v12, 0x3ff0000000000000L    # 1.0

    cmpl-double v14, v10, v12

    if-lez v14, :cond_2

    const/high16 v9, 0x3f800000    # 1.0f

    goto :goto_2

    :cond_2
    const-wide/16 v12, 0x0

    cmpg-double v14, v10, v12

    if-gez v14, :cond_3

    const/4 v9, 0x0

    :cond_3
    :goto_2
    const/4 v10, 0x3

    new-array v14, v10, [F

    const/high16 v11, 0x42c80000    # 100.0f

    div-float v12, v11, v3

    mul-float v12, v12, v9

    add-float/2addr v12, v1

    sub-float/2addr v12, v9

    aput v12, v14, v2

    div-float v12, v11, v6

    mul-float v12, v12, v9

    add-float/2addr v12, v1

    sub-float/2addr v12, v9

    aput v12, v14, v4

    div-float/2addr v11, v7

    mul-float v11, v11, v9

    add-float/2addr v11, v1

    sub-float/2addr v11, v9

    aput v11, v14, v5

    const/high16 v9, 0x40a00000    # 5.0f

    mul-float v9, v9, v0

    add-float/2addr v9, v1

    div-float v9, v1, v9

    mul-float v11, v9, v9

    mul-float v11, v11, v9

    mul-float v11, v11, v9

    sub-float/2addr v1, v11

    mul-float v11, v11, v0

    const v9, 0x3dcccccd    # 0.1f

    mul-float v9, v9, v1

    mul-float v9, v9, v1

    const-wide/high16 v12, 0x4014000000000000L    # 5.0

    float-to-double v0, v0

    mul-double v0, v0, v12

    invoke-static {v0, v1}, Ljava/lang/Math;->cbrt(D)D

    move-result-wide v0

    double-to-float v0, v0

    mul-float v9, v9, v0

    add-float v0, v11, v9

    invoke-static/range {p2 .. p2}, Landroidx/core/content/res/b;->h(F)F

    move-result v1

    aget v9, p0, v4

    div-float v11, v1, v9

    const v1, 0x3fbd70a4    # 1.48f

    float-to-double v12, v11

    move/from16 v16, v6

    invoke-static {v12, v13}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v5

    double-to-float v5, v5

    add-float v20, v5, v1

    const v1, 0x3f39999a    # 0.725f

    const-wide v5, 0x3fc999999999999aL    # 0.2

    invoke-static {v12, v13, v5, v6}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v5

    double-to-float v5, v5

    div-float/2addr v1, v5

    new-array v5, v10, [F

    aget v6, v14, v2

    mul-float v6, v6, v0

    mul-float v6, v6, v3

    float-to-double v12, v6

    const-wide/high16 v17, 0x4059000000000000L    # 100.0

    div-double v12, v12, v17

    const-wide v9, 0x3fdae147ae147ae1L    # 0.42

    invoke-static {v12, v13, v9, v10}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v12

    double-to-float v3, v12

    aput v3, v5, v2

    aget v3, v14, v4

    mul-float v3, v3, v0

    mul-float v3, v3, v16

    float-to-double v12, v3

    div-double v12, v12, v17

    invoke-static {v12, v13, v9, v10}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v12

    double-to-float v3, v12

    aput v3, v5, v4

    const/4 v3, 0x2

    aget v6, v14, v3

    mul-float v6, v6, v0

    mul-float v6, v6, v7

    float-to-double v6, v6

    div-double v6, v6, v17

    invoke-static {v6, v7, v9, v10}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v6

    double-to-float v6, v6

    aput v6, v5, v3

    const/4 v3, 0x3

    new-array v3, v3, [F

    aget v6, v5, v2

    const/high16 v7, 0x43c80000    # 400.0f

    mul-float v6, v6, v7

    aget v10, v5, v2

    const v12, 0x41d90a3d    # 27.13f

    add-float/2addr v10, v12

    div-float/2addr v6, v10

    aput v6, v3, v2

    aget v6, v5, v4

    mul-float v6, v6, v7

    aget v10, v5, v4

    add-float/2addr v10, v12

    div-float/2addr v6, v10

    aput v6, v3, v4

    const/4 v6, 0x2

    aget v9, v5, v6

    mul-float v9, v9, v7

    aget v5, v5, v6

    add-float/2addr v5, v12

    div-float/2addr v9, v5

    aput v9, v3, v6

    const/high16 v5, 0x40000000    # 2.0f

    aget v2, v3, v2

    mul-float v2, v2, v5

    aget v4, v3, v4

    add-float/2addr v2, v4

    const v4, 0x3d4ccccd    # 0.05f

    aget v3, v3, v6

    mul-float v3, v3, v4

    add-float/2addr v2, v3

    mul-float v12, v2, v1

    new-instance v2, Landroidx/core/content/res/l;

    float-to-double v3, v0

    const-wide/high16 v5, 0x3fd0000000000000L    # 0.25

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v3

    double-to-float v3, v3

    move-object v10, v2

    move v13, v1

    move-object v4, v14

    move v14, v1

    move/from16 v16, v8

    move-object/from16 v17, v4

    move/from16 v18, v0

    move/from16 v19, v3

    invoke-direct/range {v10 .. v20}, Landroidx/core/content/res/l;-><init>(FFFFFF[FFFF)V

    return-object v2
.end method


# virtual methods
.method a()F
    .locals 1

    iget v0, p0, Landroidx/core/content/res/l;->a:F

    return v0
.end method

.method b()F
    .locals 1

    iget v0, p0, Landroidx/core/content/res/l;->d:F

    return v0
.end method

.method c()F
    .locals 1

    iget v0, p0, Landroidx/core/content/res/l;->h:F

    return v0
.end method

.method d()F
    .locals 1

    iget v0, p0, Landroidx/core/content/res/l;->i:F

    return v0
.end method

.method e()F
    .locals 1

    iget v0, p0, Landroidx/core/content/res/l;->f:F

    return v0
.end method

.method f()F
    .locals 1

    iget v0, p0, Landroidx/core/content/res/l;->b:F

    return v0
.end method

.method g()F
    .locals 1

    iget v0, p0, Landroidx/core/content/res/l;->e:F

    return v0
.end method

.method h()F
    .locals 1

    iget v0, p0, Landroidx/core/content/res/l;->c:F

    return v0
.end method

.method i()[F
    .locals 1

    iget-object v0, p0, Landroidx/core/content/res/l;->g:[F

    return-object v0
.end method

.method j()F
    .locals 1

    iget v0, p0, Landroidx/core/content/res/l;->j:F

    return v0
.end method
