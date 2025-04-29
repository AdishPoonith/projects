.class public final synthetic Lw6/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb6/h;


# static fields
.field public static final synthetic a:Lw6/e;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lw6/e;

    invoke-direct {v0}, Lw6/e;-><init>()V

    sput-object v0, Lw6/e;->a:Lw6/e;

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

    invoke-static {p1}, Lcom/google/firebase/storage/StorageRegistrar;->a(Lb6/e;)Lcom/google/firebase/storage/e;

    move-result-object p1

    return-object p1
.end method
