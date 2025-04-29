.class public final synthetic Lcom/google/firebase/firestore/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb6/h;


# static fields
.field public static final synthetic a:Lcom/google/firebase/firestore/c0;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/firebase/firestore/c0;

    invoke-direct {v0}, Lcom/google/firebase/firestore/c0;-><init>()V

    sput-object v0, Lcom/google/firebase/firestore/c0;->a:Lcom/google/firebase/firestore/c0;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lb6/e;)Ljava/lang/Object;
    .locals 0

    invoke-static {p1}, Lcom/google/firebase/firestore/FirestoreRegistrar;->a(Lb6/e;)Lcom/google/firebase/firestore/b0;

    move-result-object p1

    return-object p1
.end method
