.class public final enum Lp8/a$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp8/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lp8/a$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum k:Lp8/a$c;

.field public static final enum l:Lp8/a$c;

.field public static final enum m:Lp8/a$c;

.field private static final synthetic n:[Lp8/a$c;


# instance fields
.field public final j:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lp8/a$c;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lp8/a$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lp8/a$c;->k:Lp8/a$c;

    new-instance v1, Lp8/a$c;

    const-string v3, "POSTURE_FLAT"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lp8/a$c;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lp8/a$c;->l:Lp8/a$c;

    new-instance v3, Lp8/a$c;

    const-string v5, "POSTURE_HALF_OPENED"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Lp8/a$c;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lp8/a$c;->m:Lp8/a$c;

    const/4 v5, 0x3

    new-array v5, v5, [Lp8/a$c;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Lp8/a$c;->n:[Lp8/a$c;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lp8/a$c;->j:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lp8/a$c;
    .locals 1

    const-class v0, Lp8/a$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lp8/a$c;

    return-object p0
.end method

.method public static values()[Lp8/a$c;
    .locals 1

    sget-object v0, Lp8/a$c;->n:[Lp8/a$c;

    invoke-virtual {v0}, [Lp8/a$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lp8/a$c;

    return-object v0
.end method
