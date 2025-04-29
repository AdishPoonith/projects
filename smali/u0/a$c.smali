.class public final enum Lu0/a$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu0/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lu0/a$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum j:Lu0/a$c;

.field public static final enum k:Lu0/a$c;

.field private static final synthetic l:[Lu0/a$c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lu0/a$c;

    const-string v1, "MANUAL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lu0/a$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lu0/a$c;->j:Lu0/a$c;

    new-instance v0, Lu0/a$c;

    const-string v1, "INFERENCE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lu0/a$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lu0/a$c;->k:Lu0/a$c;

    invoke-static {}, Lu0/a$c;->b()[Lu0/a$c;

    move-result-object v0

    sput-object v0, Lu0/a$c;->l:[Lu0/a$c;

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

.method private static final synthetic b()[Lu0/a$c;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Lu0/a$c;

    sget-object v1, Lu0/a$c;->j:Lu0/a$c;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lu0/a$c;->k:Lu0/a$c;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lu0/a$c;
    .locals 1

    const-string v0, "value"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Lu0/a$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lu0/a$c;

    return-object p0
.end method

.method public static values()[Lu0/a$c;
    .locals 2

    sget-object v0, Lu0/a$c;->l:[Lu0/a$c;

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lu0/a$c;

    return-object v0
.end method
