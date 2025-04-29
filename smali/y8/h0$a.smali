.class final enum Ly8/h0$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly8/h0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ly8/h0$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum j:Ly8/h0$a;

.field public static final enum k:Ly8/h0$a;

.field public static final enum l:Ly8/h0$a;

.field private static final synthetic m:[Ly8/h0$a;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Ly8/h0$a;

    const-string v1, "FILE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ly8/h0$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ly8/h0$a;->j:Ly8/h0$a;

    new-instance v1, Ly8/h0$a;

    const-string v3, "BYTES"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Ly8/h0$a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Ly8/h0$a;->k:Ly8/h0$a;

    new-instance v3, Ly8/h0$a;

    const-string v5, "DOWNLOAD"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Ly8/h0$a;-><init>(Ljava/lang/String;I)V

    sput-object v3, Ly8/h0$a;->l:Ly8/h0$a;

    const/4 v5, 0x3

    new-array v5, v5, [Ly8/h0$a;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Ly8/h0$a;->m:[Ly8/h0$a;

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

.method public static valueOf(Ljava/lang/String;)Ly8/h0$a;
    .locals 1

    const-class v0, Ly8/h0$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ly8/h0$a;

    return-object p0
.end method

.method public static values()[Ly8/h0$a;
    .locals 1

    sget-object v0, Ly8/h0$a;->m:[Ly8/h0$a;

    invoke-virtual {v0}, [Ly8/h0$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ly8/h0$a;

    return-object v0
.end method
