.class public final synthetic Le9/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le9/s$c;


# instance fields
.field public final synthetic a:Lg8/d;


# direct methods
.method public synthetic constructor <init>(Lg8/d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le9/r;->a:Lg8/d;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Le9/r;->a:Lg8/d;

    invoke-virtual {v0, p1}, Lg8/d;->h(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
