.class public final enum Ls0/e$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls0/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls0/e$a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ls0/e$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final k:Ls0/e$a$a;

.field public static final enum l:Ls0/e$a;

.field public static final enum m:Ls0/e$a;

.field public static final enum n:Ls0/e$a;

.field private static final synthetic o:[Ls0/e$a;


# instance fields
.field private final j:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ls0/e$a;

    const-string v1, "OPTIONS"

    const/4 v2, 0x0

    const-string v3, "data_processing_options"

    invoke-direct {v0, v1, v2, v3}, Ls0/e$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ls0/e$a;->l:Ls0/e$a;

    new-instance v0, Ls0/e$a;

    const-string v1, "COUNTRY"

    const/4 v2, 0x1

    const-string v3, "data_processing_options_country"

    invoke-direct {v0, v1, v2, v3}, Ls0/e$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ls0/e$a;->m:Ls0/e$a;

    new-instance v0, Ls0/e$a;

    const-string v1, "STATE"

    const/4 v2, 0x2

    const-string v3, "data_processing_options_state"

    invoke-direct {v0, v1, v2, v3}, Ls0/e$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Ls0/e$a;->n:Ls0/e$a;

    invoke-static {}, Ls0/e$a;->b()[Ls0/e$a;

    move-result-object v0

    sput-object v0, Ls0/e$a;->o:[Ls0/e$a;

    new-instance v0, Ls0/e$a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ls0/e$a$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Ls0/e$a;->k:Ls0/e$a$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Ls0/e$a;->j:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic b()[Ls0/e$a;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ls0/e$a;

    sget-object v1, Ls0/e$a;->l:Ls0/e$a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Ls0/e$a;->m:Ls0/e$a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Ls0/e$a;->n:Ls0/e$a;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ls0/e$a;
    .locals 1

    const-string v0, "value"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Ls0/e$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ls0/e$a;

    return-object p0
.end method

.method public static values()[Ls0/e$a;
    .locals 2

    sget-object v0, Ls0/e$a;->o:[Ls0/e$a;

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ls0/e$a;

    return-object v0
.end method


# virtual methods
.method public final g()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ls0/e$a;->j:Ljava/lang/String;

    return-object v0
.end method
