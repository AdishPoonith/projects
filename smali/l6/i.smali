.class public final synthetic Ll6/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq6/y;


# instance fields
.field public final synthetic a:Ll6/k;


# direct methods
.method public synthetic constructor <init>(Ll6/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll6/i;->a:Ll6/k;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ll6/i;->a:Ll6/k;

    invoke-static {v0}, Ll6/k;->a(Ll6/k;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
