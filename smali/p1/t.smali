.class public final enum Lp1/t;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lp1/t;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum q:Lp1/t;

.field public static final enum r:Lp1/t;

.field public static final enum s:Lp1/t;

.field public static final enum t:Lp1/t;

.field public static final enum u:Lp1/t;

.field public static final enum v:Lp1/t;

.field private static final synthetic w:[Lp1/t;


# instance fields
.field private final j:Z

.field private final k:Z

.field private final l:Z

.field private final m:Z

.field private final n:Z

.field private final o:Z

.field private final p:Z


# direct methods
.method static constructor <clinit>()V
    .locals 21

    new-instance v10, Lp1/t;

    const-string v1, "NATIVE_WITH_FALLBACK"

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x1

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v8, 0x1

    const/4 v9, 0x1

    move-object v0, v10

    invoke-direct/range {v0 .. v9}, Lp1/t;-><init>(Ljava/lang/String;IZZZZZZZ)V

    sput-object v10, Lp1/t;->q:Lp1/t;

    new-instance v0, Lp1/t;

    const-string v12, "NATIVE_ONLY"

    const/4 v13, 0x1

    const/4 v14, 0x1

    const/4 v15, 0x1

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x1

    const/16 v20, 0x1

    move-object v11, v0

    invoke-direct/range {v11 .. v20}, Lp1/t;-><init>(Ljava/lang/String;IZZZZZZZ)V

    sput-object v0, Lp1/t;->r:Lp1/t;

    new-instance v0, Lp1/t;

    const-string v2, "KATANA_ONLY"

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v1, v0

    invoke-direct/range {v1 .. v10}, Lp1/t;-><init>(Ljava/lang/String;IZZZZZZZ)V

    sput-object v0, Lp1/t;->s:Lp1/t;

    new-instance v0, Lp1/t;

    const-string v12, "WEB_ONLY"

    const/4 v13, 0x3

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x1

    const/16 v18, 0x1

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object v11, v0

    invoke-direct/range {v11 .. v20}, Lp1/t;-><init>(Ljava/lang/String;IZZZZZZZ)V

    sput-object v0, Lp1/t;->t:Lp1/t;

    new-instance v0, Lp1/t;

    const-string v2, "DIALOG_ONLY"

    const/4 v3, 0x4

    const/4 v6, 0x1

    const/4 v8, 0x1

    const/4 v9, 0x1

    const/4 v10, 0x1

    move-object v1, v0

    invoke-direct/range {v1 .. v10}, Lp1/t;-><init>(Ljava/lang/String;IZZZZZZZ)V

    sput-object v0, Lp1/t;->u:Lp1/t;

    new-instance v0, Lp1/t;

    const-string v12, "DEVICE_AUTH"

    const/4 v13, 0x5

    const/16 v16, 0x0

    const/16 v17, 0x1

    const/16 v18, 0x0

    move-object v11, v0

    invoke-direct/range {v11 .. v20}, Lp1/t;-><init>(Ljava/lang/String;IZZZZZZZ)V

    sput-object v0, Lp1/t;->v:Lp1/t;

    invoke-static {}, Lp1/t;->b()[Lp1/t;

    move-result-object v0

    sput-object v0, Lp1/t;->w:[Lp1/t;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IZZZZZZZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZZZZZZ)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-boolean p3, p0, Lp1/t;->j:Z

    iput-boolean p4, p0, Lp1/t;->k:Z

    iput-boolean p5, p0, Lp1/t;->l:Z

    iput-boolean p6, p0, Lp1/t;->m:Z

    iput-boolean p7, p0, Lp1/t;->n:Z

    iput-boolean p8, p0, Lp1/t;->o:Z

    iput-boolean p9, p0, Lp1/t;->p:Z

    return-void
.end method

.method private static final synthetic b()[Lp1/t;
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [Lp1/t;

    sget-object v1, Lp1/t;->q:Lp1/t;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lp1/t;->r:Lp1/t;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Lp1/t;->s:Lp1/t;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Lp1/t;->t:Lp1/t;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Lp1/t;->u:Lp1/t;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Lp1/t;->v:Lp1/t;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lp1/t;
    .locals 1

    const-string v0, "value"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Lp1/t;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lp1/t;

    return-object p0
.end method

.method public static values()[Lp1/t;
    .locals 2

    sget-object v0, Lp1/t;->w:[Lp1/t;

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lp1/t;

    return-object v0
.end method


# virtual methods
.method public final g()Z
    .locals 1

    iget-boolean v0, p0, Lp1/t;->n:Z

    return v0
.end method

.method public final h()Z
    .locals 1

    iget-boolean v0, p0, Lp1/t;->m:Z

    return v0
.end method

.method public final i()Z
    .locals 1

    iget-boolean v0, p0, Lp1/t;->j:Z

    return v0
.end method

.method public final k()Z
    .locals 1

    iget-boolean v0, p0, Lp1/t;->p:Z

    return v0
.end method

.method public final l()Z
    .locals 1

    iget-boolean v0, p0, Lp1/t;->k:Z

    return v0
.end method

.method public final n()Z
    .locals 1

    iget-boolean v0, p0, Lp1/t;->l:Z

    return v0
.end method
