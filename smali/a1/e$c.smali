.class public final enum La1/e$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La1/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "La1/e$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum j:La1/e$c;

.field public static final enum k:La1/e$c;

.field public static final enum l:La1/e$c;

.field private static final synthetic m:[La1/e$c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, La1/e$c;

    const-string v1, "OPERATION_SUCCESS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, La1/e$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, La1/e$c;->j:La1/e$c;

    new-instance v0, La1/e$c;

    const-string v1, "SERVICE_NOT_AVAILABLE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, La1/e$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, La1/e$c;->k:La1/e$c;

    new-instance v0, La1/e$c;

    const-string v1, "SERVICE_ERROR"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, La1/e$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, La1/e$c;->l:La1/e$c;

    invoke-static {}, La1/e$c;->b()[La1/e$c;

    move-result-object v0

    sput-object v0, La1/e$c;->m:[La1/e$c;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static final synthetic b()[La1/e$c;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [La1/e$c;

    sget-object v1, La1/e$c;->j:La1/e$c;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, La1/e$c;->k:La1/e$c;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, La1/e$c;->l:La1/e$c;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)La1/e$c;
    .locals 1

    const-string v0, "value"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, La1/e$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, La1/e$c;

    return-object p0
.end method

.method public static values()[La1/e$c;
    .locals 2

    sget-object v0, La1/e$c;->m:[La1/e$c;

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [La1/e$c;

    return-object v0
.end method
