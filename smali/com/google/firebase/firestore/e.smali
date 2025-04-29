.class public final enum Lcom/google/firebase/firestore/e;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/firebase/firestore/e;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum j:Lcom/google/firebase/firestore/e;

.field private static final synthetic k:[Lcom/google/firebase/firestore/e;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/google/firebase/firestore/e;

    const-string v1, "SERVER"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/firebase/firestore/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/firebase/firestore/e;->j:Lcom/google/firebase/firestore/e;

    const/4 v1, 0x1

    new-array v1, v1, [Lcom/google/firebase/firestore/e;

    aput-object v0, v1, v2

    sput-object v1, Lcom/google/firebase/firestore/e;->k:[Lcom/google/firebase/firestore/e;

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

.method public static valueOf(Ljava/lang/String;)Lcom/google/firebase/firestore/e;
    .locals 1

    const-class v0, Lcom/google/firebase/firestore/e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/google/firebase/firestore/e;

    return-object p0
.end method

.method public static values()[Lcom/google/firebase/firestore/e;
    .locals 1

    sget-object v0, Lcom/google/firebase/firestore/e;->k:[Lcom/google/firebase/firestore/e;

    invoke-virtual {v0}, [Lcom/google/firebase/firestore/e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/firebase/firestore/e;

    return-object v0
.end method
