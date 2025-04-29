.class public final enum Lu4/e$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu4/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lu4/e$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum j:Lu4/e$a;

.field public static final enum k:Lu4/e$a;

.field private static final synthetic l:[Lu4/e$a;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lu4/e$a;

    const-string v1, "LEGACY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lu4/e$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lu4/e$a;->j:Lu4/e$a;

    new-instance v1, Lu4/e$a;

    const-string v3, "LATEST"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lu4/e$a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lu4/e$a;->k:Lu4/e$a;

    const/4 v3, 0x2

    new-array v3, v3, [Lu4/e$a;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Lu4/e$a;->l:[Lu4/e$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lu4/e$a;
    .locals 1

    const-class v0, Lu4/e$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lu4/e$a;

    return-object p0
.end method

.method public static values()[Lu4/e$a;
    .locals 1

    sget-object v0, Lu4/e$a;->l:[Lu4/e$a;

    invoke-virtual {v0}, [Lu4/e$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lu4/e$a;

    return-object v0
.end method
