.class public final synthetic Lw5/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv6/h$a;


# static fields
.field public static final synthetic a:Lw5/i;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 1

    new-instance v0, Lw5/i;

    invoke-direct {v0}, Lw5/i;-><init>()V

    sput-object v0, Lw5/i;->a:Lw5/i;

    return-void
.end method

.method private synthetic constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/String;
    .locals 0

    check-cast p1, Landroid/content/Context;

    invoke-static {p1}, Lcom/google/firebase/FirebaseCommonRegistrar;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
